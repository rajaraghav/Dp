import sun.security.krb5.internal.crypto.Des;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution {

    public static void main(String[] args){

        StringPermWithoutDups st = new StringPermWithoutDups();
        st.updateSetWithPermutations("abcd");
        st.printSet();
    }
}
