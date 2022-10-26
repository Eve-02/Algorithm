package 字典树.t208_实现Trie前缀树.r1_字典树;


// https://leetcode.cn/problems/implement-trie-prefix-tree/
public class Trie {

    // 【执行用时：33ms, 在所有 Java 提交中击败了 75.78% 的用户】
    private Trie[] children; // children: 存储的数据类型是 26 个小写字母，使用数组存储，当对应下标存在时，也就是其孩子结点(地址)，其值为对应下标的字母。
    private boolean isEnd; // isEnd: 是否为字符串的结尾

    public Trie(){
        children = new Trie[26]; // 默认值为 Null，即不存在
        isEnd = false; // 当前结点只作为字典树的引用
    }

    /**
     * 插入单词
     */
    public void insert(String word){
        Trie node = this; // 根结点
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            int index = ch - 'a';
            if(node.children[index] == null){ // 对应字符不存在
                node.children[index] = new Trie(); // 创建结点
            }
            node = node.children[index]; // 继续往下判断创建，当然，不管上一个字符是否存在，都需要获取指定存放数据位置(下标)的结点。
        }
        node.isEnd = true; // 最后创建的结点即为字符串的结尾
    }

    /**
     * 查找单词，如果字符串 word 在字典树中，返回 true.
     */
    public boolean search(String word){
        Trie node = searchPrefix(word);
        // 如果查找失败，即 node == null，则说明不含该前缀(序列)，也就不含有该单词。
        // 如果查找成功，则 node != null，当 node(作为前缀的最后一个字符) 的 isEnd 为 true时，才代表 word 是一个单词，否则只是一个前缀。
        return node != null && node.isEnd;
    }

    /**
     * 查找前缀，如果 prefix 是字典树中的一个前缀，则返回 true.
     */
    public boolean startsWith(String prefix){
        return searchPrefix(prefix) != null; // 只需要判断是否为前缀，不需要用 isEnd 来判断是否为一个单词.
    }


    /**
     * 查找前缀。返回该前缀的最后一个结点字符。
     */
    private Trie searchPrefix(String prefix){
        Trie node = this;
        for(int i = 0;i<prefix.length();i++){
            char ch = prefix.charAt(i);
            int index = ch - 'a'; // 取下标
            if(node.children[index] == null){ // 如果该位置不存在，说明没有该前缀
                return null; // 返回 Null
            }
            node = node.children[index]; // 存在，在该结点上继续查找下一个字符是否存在
        }
        return node; // 当循环线束，说明前缀的全部字符都按顺序存在，并且 node 就是该 前缀字符串 在 字典树中 的结尾，将其返回
    }


}
