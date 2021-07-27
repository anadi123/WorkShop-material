package com.mphasis.cui;

public class ArithmeticMockito {
        private CalculatorService calculatorService;
        public void  setCalculatorService(CalculatorService calculatorService){
            this.calculatorService=calculatorService;

        }
        public double add(double inum1, double inum2){
            return calculatorService.add(inum1,inum2);
        }

         public double subtract(double inum1, double inum2){
            return calculatorService.subtract(inum1,inum2);
        }

        public double multiply(double inum1,double inum2){
             return calculatorService.multiply(inum1,inum2);
    }

        public double divide(double inum1,double inum2){
            return calculatorService.divide(inum1,inum2);
    }

        }
