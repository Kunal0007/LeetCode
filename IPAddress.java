package com.company.LeetCode;

// https://leetcode.com/problems/defanging-an-ip-address/

public class IPAddress {
    public static void main(String[] args) {
        System.out.println(defangIPaddr("255.100.50.0"));
    }

    static public String defangIPaddr(String address) {
        address = address.replace(".", "[.]");
        return address;
    }
}
