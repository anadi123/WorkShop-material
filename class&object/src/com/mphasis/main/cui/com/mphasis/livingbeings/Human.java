package com.mphasis.main.cui.com.mphasis.livingbeings;

import com.mphasis.main.cui.com.mphasis.livingbeings.Human;
public class Human {
    public HumanEye leftEye,rightEye;
    public Human()
    {
        System.out.println("Human created");
        leftEye=new HumanEye();
        rightEye=new HumanEye();
    }
    public class HumanEye extends Eye
    {
        public float power;
    }
}
