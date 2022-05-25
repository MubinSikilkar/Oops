package com.company;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class cwh_31_Java_Methods {
    static void change(int arr[]){
        arr[0]=98;

    }

    public static void main(String[] args) {
        int arr[]={89,90,98,97,96};
        change( arr);
        System.out.println(arr[0]);
    }

}
