package com.mphasis.main.cui;
public class HR {
    public  Employee recruit(char empType) {
        if (empType == 'i' || empType == 'I') {
            return new Intern();
        } else if (empType == 'p' || empType == 'P') {
            return new Permanent();
        } else if(empType=='C' || empType=='c'){
            return new Contract();
        }
        return null;
    }
}
