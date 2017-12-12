/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 *
 * @author Skane
 */
public class BuildingLOS {

    private HashMap<String, Double> I1;// = new HashMap<String,Double>();// contains all membership values (VH,H,M,L,VL)
    private HashMap<String, Double> I2;// = new HashMap<String,Double>();
    private HashMap<String, Double> I3;// = new HashMap<String,Double>();
    private HashMap<String, Integer> I4;// = new HashMap<String,Integer>();
    private HashMap<String, Double> I5;// = new HashMap<String,Double>();
    private HashMap<String, Integer> I6;// = new HashMap<String,Integer>();
    private HashMap<String, Integer> I7;// = new HashMap<String,Integer>();
    private HashMap<String, Double> I8;// = new HashMap<String,Double>();
    private HashMap<String, Double> I9;// = new HashMap<String,Double>();
    private HashMap<String, Double> I10;// = new HashMap<String,Double>();
    private HashMap<String, Double> I11;// = new HashMap<String,Double>();
    private HashMap<String, Double> I12;// = new HashMap<String,Double>();
    private HashMap<String, Double> I13;// = new HashMap<String,Double>();
    private HashMap<String, Double> I14;// = new HashMap<String, Double>();
    private HashMap<String, Double> I15;// = new HashMap<String, Double>();
    private HashMap<String, Double> I16;// = new HashMap<String, Double>();
    private HashMap<String, Double> I17;// = new HashMap<String, Double>();
    private HashMap<String, Double> I18;// = new HashMap<String, Double>();
    private HashMap<String, Double> I19;// = new HashMap<String, Double>();
    private HashMap<String, Integer> I20;// = new HashMap<String, Integer>();
    private HashMap<String, Double> I21;// = new HashMap<String, Double>();
    private HashMap<String, Double> I22;//= new HashMap<String, Double>();

    double MVHSafety, MHSafety, MMSafety, MLSafety, MVLSafety;
    double MVHQuality, MHQuality, MMQuality, MLQuality, MVLQuality;
    double MVHQuantity, MHQuantity, MMQuantity, MLQuantity, MVLQuantity;
    double MVHCapacity, MHCapacity, MMCapacity, MLCapacity, MVLCapacity;
    double MVHReliability, MHReliability, MMReliability, MLReliability, MVLReliability;
    double MVHResponse, MHResponse, MMResponse, MLResponse, MVLResponse;
    double MVHEnvironment, MHEnvironment, MMEnvironment, MLEnvironment, MVLEnvironment;
    double MVHCost, MHCost, MMCost, MLCost, MVLCost;
    double MVHAvailability, MHAvailability, MMAvailability, MLAvailability, MVLAvailability;
    
   

    private void setMembershipsI4(int lowerBound, int upperBound) {
        ArrayList<Integer> potentialVH = new ArrayList<>();
        //  ArrayList<Integer> potentialH = new ArrayList<Integer>();
        ArrayList<Integer> potentialM = new ArrayList<Integer>();
        //   ArrayList<Integer> potentialL = new ArrayList<Integer>();
        ArrayList<Integer> potentialVL = new ArrayList<Integer>();

        // int VH= 0, H=0, M=0, L=0, VL=0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (25 < i && i < 26) {

                potentialVH.add(1);

            } else {
                potentialVH.add(0);
            }

            if (22 < i && i < 24) {
                potentialM.add(1);
            } else {
                potentialM.add(0);
            }

            if (22 < i && i < 26) {
                potentialVL.add(1);
            } else {
                potentialVL.add(0);
            }

        }
        I4 = new HashMap<>();
        I4.put("VH", (int) Collections.max(potentialVH));
        I4.put("H", 0);
        I4.put("M", (int) Collections.max(potentialM));
        I4.put("L", 0);
        I4.put("VL", (int) Collections.max(potentialVL));

    }

    private void setMembershipsI6(int lowerBound, int upperBound) {

        ArrayList<Integer> potentialVH = new ArrayList<>();
        //  ArrayList<Integer> potentialH = new ArrayList<Integer>();
        ArrayList<Integer> potentialM = new ArrayList<Integer>();
        //   ArrayList<Integer> potentialL = new ArrayList<Integer>();
        ArrayList<Integer> potentialVL = new ArrayList<Integer>();

        // int VH= 0, H=0, M=0, L=0, VL=0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (40 > i) {

                potentialVH.add(1);

            } else {
                potentialVH.add(0);
            }

            if (40 < i && i < 45) {
                potentialM.add(1);
            } else {
                potentialM.add(0);
            }

            if (45 < i) {
                potentialVL.add(1);
            } else {
                potentialVL.add(0);
            }

        }
        I6 = new HashMap<>();
        I6.put("VH", (int) Collections.max(potentialVH));
        I6.put("H", 0);
        I6.put("M", (int) Collections.max(potentialM));
        I6.put("L", 0);
        I6.put("VL", (int) Collections.max(potentialVL));

    }

    private void setMembershipsI7(int lowerBound, int upperBound) {

        ArrayList<Integer> potentialVH = new ArrayList<>();
        //  ArrayList<Integer> potentialH = new ArrayList<Integer>();
        ArrayList<Integer> potentialM = new ArrayList<Integer>();
        //   ArrayList<Integer> potentialL = new ArrayList<Integer>();
        ArrayList<Integer> potentialVL = new ArrayList<Integer>();

        // int VH= 0, H=0, M=0, L=0, VL=0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (750 < i) {

                potentialVH.add(1);

            } else {
                potentialVH.add(0);
            }

            if (500 < i && i < 750) {
                potentialM.add(1);
            } else {
                potentialM.add(0);
            }

            if (500 < i) {
                potentialVL.add(1);
            } else {
                potentialVL.add(0);
            }

        }
        I7 = new HashMap<>();
        I7.put("VH", (int) Collections.max(potentialVH));
        I7.put("H", 0);
        I7.put("M", (int) Collections.max(potentialM));
        I7.put("L", 0);
        I7.put("VL", (int) Collections.max(potentialVL));

        /*  for(String key : I7.keySet())
         System.out.println(key +" = "+ I7.get(key));
     
         */
    }

    private void setMembershipsI20(int lowerBound, int upperBound) {

        ArrayList<Integer> potentialVH = new ArrayList<>();
        //  ArrayList<Integer> potentialH = new ArrayList<Integer>();
        ArrayList<Integer> potentialM = new ArrayList<Integer>();
        //   ArrayList<Integer> potentialL = new ArrayList<Integer>();
        ArrayList<Integer> potentialVL = new ArrayList<Integer>();

        // int VH= 0, H=0, M=0, L=0, VL=0;
        for (int i = lowerBound; i <= upperBound; i++) {
            if (100 < i) {

                potentialVH.add(1);

            } else {
                potentialVH.add(0);
            }

            if (i == 100) {
                potentialM.add(1);
            } else {
                potentialM.add(0);
            }

            if (100 > i) {
                potentialVL.add(1);
            } else {
                potentialVL.add(0);
            }

        }
        I20 = new HashMap<>();
        I20.put("VH", (int) Collections.max(potentialVH));
        I20.put("H", 0);
        I20.put("M", (int) Collections.max(potentialM));
        I20.put("L", 0);
        I20.put("VL", (int) Collections.max(potentialVL));

//        for(String key : I20.keySet())
//         System.out.println(key +" = "+ I20.get(key));
    }

    private HashMap setGeneralMemberships(int lowerBound, int upperBound) {

        HashMap<String, Double> results = new HashMap<>();

        ArrayList<Double> potentialVH = new ArrayList<Double>();
        ArrayList<Double> potentialH = new ArrayList<Double>();
        ArrayList<Double> potentialM = new ArrayList<Double>();
        ArrayList<Double> potentialL = new ArrayList<Double>();
        ArrayList<Double> potentialVL = new ArrayList<Double>();

        for (int i = lowerBound; i <= upperBound; i++) {

            if (i > 10) {
                potentialVH.add((double) 1);
            } else if (8 < i && i < 10) {
                // double val = (0.5*i)-4;
                potentialVH.add((0.5 * i) - 4);
            } else if (i < 8) {
                potentialVH.add((double) 0);
            }

            if (i < 6) {
                potentialH.add((double) 0);
            } else if (6 < i && i < 8) {
                //double val = (0.5*1)-3;
                potentialH.add((0.5 * i) - 3);
            } else if (8 < i && i < 10) {

                potentialH.add((-0.5 * i) + 5);
            } else if (i > 10) {
                potentialH.add((double) 0);
            }

            if (i < 3) {
                potentialM.add((double) 0);
            } else if (3 < i && i < 5) {
                potentialM.add((0.5 * i) - (3 / 2));
            } else if (5 < i && i < 7) {
                potentialM.add((-0.5 * i) + (7 / 2));
            } else if (i > 7) {
                potentialM.add((double) 0);
            }

            if (i < 0) {
                potentialL.add((double) 0);
            } else if (0 < i && i < 2) {
                potentialL.add(0.5 * i);
            } else if (2 < i && i < 4) {
                potentialL.add((-0.5 * i) + 2);
            } else if (i > 4) {
                potentialL.add((double) 0);
            }

            if (i < 0) {
                potentialVL.add((double) 1);
            } else if (i < 2) {
                potentialVL.add((-0.5 * i) + 1);
            } else if (i > 2) {
                potentialVL.add((double) 0);
            }

        }

        results.put("VH", (double) Collections.max(potentialVH));
        results.put("H", (double) Collections.max(potentialH));
        results.put("M", (double) Collections.max(potentialM));
        results.put("L", (double) Collections.max(potentialL));
        results.put("VL", (double) Collections.max(potentialVL));

        return results;
    }

    private void setMembershipsI1(int lowerBound, int upperBound) {

        I1 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));

        /* for (String key : I1.keySet()) {
            System.out.println(key + " = " + I1.get(key));
        }
         */
    }

    private void setMembershipsI2(int lowerBound, int upperBound) {

        I2 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
       
    }

    private void setMembershipsI3(int lowerBound, int upperBound) {

        I3 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));

    }

    private void setMembershipsI5(int lowerBound, int upperBound) {

        I5 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI8(int lowerBound, int upperBound) {

        I8 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI9(int lowerBound, int upperBound) {

        I9 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI10(int lowerBound, int upperBound) {

        I10 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI11(int lowerBound, int upperBound) {

        I11 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI12(int lowerBound, int upperBound) {

        I12 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
         for (String key : I12.keySet()) {
            System.out.println(key + " = " + I12.get(key));}

    }

    private void setMembershipsI13(int lowerBound, int upperBound) {

        I13 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI14(int lowerBound, int upperBound) {

        I14 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI15(int lowerBound, int upperBound) {

        I15 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI16(int lowerBound, int upperBound) {

        I16 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI17(int lowerBound, int upperBound) {

        I17 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI18(int lowerBound, int upperBound) {

        I18 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI19(int lowerBound, int upperBound) {

        I19 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI21(int lowerBound, int upperBound) {

        I21 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    private void setMembershipsI22(int lowerBound, int upperBound) {

        I22 = new HashMap<>(setGeneralMemberships(lowerBound, upperBound));
    }

    public static void main(String[] args) {

        // new BuildingLOS().setMembershipsI7(450, 800);
        //  new BuildingLOS().setMembershipsI20(80, 110);
       // new BuildingLOS().setMembershipsI12(2, 6);

    }
    
    public void setMemberships(Parameter parameter){
    
        setMembershipsI1(parameter.getProtectionLB(), parameter.getProtectionUB());
        setMembershipsI2(parameter.getSatisfactionLB(), parameter.getSatisfactionUB());
        setMembershipsI3(parameter.getAirLB(), parameter.getAirUB());
        setMembershipsI4(parameter.getThermalLB(), parameter.getThermalUB());
        setMembershipsI5(parameter.getCleanLB(), parameter.getCleanUB());
        setMembershipsI6(parameter.getNoiseLB(), parameter.getNoiseUB());
        setMembershipsI7(parameter.getLuminanceLB(), parameter.getLuminanceUB());
        setMembershipsI8(parameter.getAmenetiesLB(), parameter.getAmenetiesUB());
        setMembershipsI9(parameter.getEquipmentLB(), parameter.getEquipmentUB());
        setMembershipsI10(parameter.getServiceLB(), parameter.getServiceUB());
        setMembershipsI11(parameter.getSafetyLB(), parameter.getSafetyUB());
        setMembershipsI12(parameter.getInterruptionsLB(), parameter.getInterruptionsUB());
        setMembershipsI13(parameter.getNoServiceInterruptionsLB(), parameter.getNoServiceInterruptionsUB());
        setMembershipsI14(parameter.getPoolQualityLB(), parameter.getPoolQualityUB());
        setMembershipsI15(parameter.getEnergyIntensityLB(), parameter.getEnergyIntensityUB());
        setMembershipsI16(parameter.getRenewableEnergyLB(), parameter.getRenewableEnergyUB());
        setMembershipsI17(parameter.getGhgReductionLB(), parameter.getGhgReductionUB());
        setMembershipsI18(parameter.getWaterConsumptionLB(), parameter.getWaterConsumptionUB());
        setMembershipsI19(parameter.getRecycledWaterLB(), parameter.getRecycledWaterUB());
        setMembershipsI20(parameter.getOpCostsLB(), parameter.getOpCostsUB());
        setMembershipsI21(parameter.getAmenityForDisabilityLB(), parameter.getAmenityForDisabilityUB());
        setMembershipsI22(parameter.getCyclingConvenienveLB(), parameter.getCyclingConvenienceUB());
   
        System.out.println(parameter.getInterruptionsLB() +","+parameter.getInterruptionsUB());
        System.out.println(parameter.getCyclingConvenienveLB()+","+parameter.getCyclingConvenienceUB());

    }
    
    
    public int getSafetyScore(){
    
        //indicator 1,2,3,11
        
        
        
        
        MVHSafety = (I1.get("VH") + I2.get("VH") + I3.get("VH") + I11.get("VH"))*0.25;
        MHSafety = (I1.get("H") + I2.get("H") + I3.get("H") + I11.get("H"))*0.25;
        MMSafety = (I1.get("M") + I2.get("M") + I3.get("M") + I11.get("M"))*0.25;
        MLSafety = (I1.get("L") + I2.get("L") + I3.get("L") + I11.get("L"))*0.25;
        MVLSafety = (I1.get("VL") + I2.get("VL") + I3.get("VL") + I11.get("VL"))*0.25;

        double score =  (MVHSafety*10) + (MHSafety*8) + (MMSafety*5) + (MLSafety*3) + (MVLSafety*1);
    
    
    
    return (int) Math.round(score);
    }
    
    
    public int getQualityScore(){
    
        //indicators 2,4,5,6,7,8,14
        
    

        MVHQuality = (I2.get("VH") + I4.get("VH") + I6.get("VH") + I14.get("VH") + I5.get("VH")+ I7.get("VH") + I8.get("VH")) / 7;
        MHQuality = (I2.get("H") + I4.get("H") + I6.get("H") + I14.get("H") + I5.get("H")+ I7.get("H") + I8.get("H")) / 7;
        MMQuality = (I2.get("M") + I4.get("M") + I6.get("M") + I14.get("M") + I5.get("M")+ I7.get("M") + I8.get("M")) / 7;
        MLQuality = (I2.get("L") + I4.get("L") + I6.get("L") + I14.get("L") + I5.get("L")+ I7.get("L") + I8.get("L")) / 7;
        MVLQuality = (I2.get("VL") + I4.get("VL") + I6.get("VL") + I14.get("VL") + I5.get("VL")+ I7.get("VL") + I8.get("VL")) / 7;

        double score = (MVHQuality * 10) + (MHQuality * 8) + (MMQuality * 5) + (MLQuality * 3) + (MVLQuality * 1);

        return (int) Math.round(score);
    }
    public int getQuantityScore(){
        
   
    
    //indicator 2
    
        MVHQuantity = I2.get("VH");
        MHQuantity = I2.get("H");
        MMQuantity = I2.get("M");
        MLQuantity = I2.get("L");
        MVLQuantity = I2.get("VL");
        
        double score =  (MVHQuantity*10) + (MHQuantity*8) + (MMQuantity*5) + (MLQuantity*3) + (MVLQuantity*1);
            
    
     return (int) Math.round(score);
    
    }
    
    
    public int getCapacityScore() {

        //indicator 2,8,9
      

        MVHCapacity = (I2.get("VH") + I8.get("VH") + I9.get("VH")) / 3;
        MHCapacity = (I2.get("H") + I8.get("H") + I9.get("H")) / 3;
        MMCapacity = (I2.get("M") + I8.get("M") + I9.get("M")) / 3;
        MLCapacity = (I2.get("L") + I8.get("L") + I9.get("L")) / 3;
        MVLCapacity = (I2.get("VL") + I8.get("VL") + I9.get("VL")) / 3;

        double score = (MVHCapacity * 10) + (MHCapacity * 8) + (MMCapacity * 5) + (MLCapacity * 3) + (MVLCapacity * 1);

        return (int) Math.round(score);

    }
    
    
    
    public int getReliabilityScore(){
    
    //indicator 2,9,10,11,12,13
    
  
        
        MVHReliability = (I1.get("VH") + I2.get("VH") + I3.get("VH") + I11.get("VH"))*0.25;
        MHReliability = (I1.get("H") + I2.get("H") + I3.get("H") + I11.get("H"))*0.25;
        MMReliability= (I1.get("M") + I2.get("M") + I3.get("M") + I11.get("M"))*0.25;
        MLReliability = (I1.get("L") + I2.get("L") + I3.get("L") + I11.get("L"))*0.25;
        MVLReliability = (I1.get("VL") + I2.get("VL") + I3.get("VL") + I11.get("VL"))*0.25;

        double score =  (MVHReliability*10) + (MHReliability*8) + (MMReliability*5) + (MLReliability*3) + (MVLReliability*1);
    
    
    
    return (int) Math.round(score);
    
    
    
    }
    public int getResponsivenessScore(){
    
    //indicator 2,12,13
    

        MVHResponse = (I2.get("VH") + I12.get("VH") + I13.get("VH")) / 3;
        MHResponse = (I2.get("H") + I12.get("H") + I13.get("H")) / 3;
        MMResponse = (I2.get("M") + I12.get("M") + I13.get("M")) / 3;
        MLResponse = (I2.get("L") + I12.get("L") + I13.get("L")) / 3;
        MVLResponse = (I2.get("VL") + I12.get("VL") + I13.get("VL")) / 3;

        double score = (MVHResponse * 10) + (MHResponse * 8) + (MMResponse * 5) + (MLResponse * 3) + (MVLResponse * 1);

        return (int) Math.round(score);
    
    
    
    
    }
    public int getEnvironmentAcceptabilityScore(){
    
    //indicator 2, 4 , 6 , 14 , 16 , 17 , 18 , 19 , 22 
    
  

        MVHEnvironment = (I2.get("VH") + I4.get("VH") + I6.get("VH") + I14.get("VH") + I16.get("VH")+ I17.get("VH") + I18.get("VH")+ I19.get("VH") + I22.get("VH")) / 9;
        MHEnvironment = (I2.get("H") + I4.get("H") + I6.get("H") + I14.get("H") + I16.get("H")+ I17.get("H") + I18.get("H")+ I19.get("H") + I22.get("H")) / 9;
        MMEnvironment = (I2.get("M") + I4.get("M") + I6.get("M") + I14.get("M") + I16.get("M")+ I17.get("M") + I18.get("M")+ I19.get("M") + I22.get("M")) / 9;
        MLEnvironment = (I2.get("L") + I4.get("L") + I6.get("L") + I14.get("L") + I16.get("L")+ I17.get("L") + I18.get("L")+ I19.get("L") + I22.get("L")) / 9;
        MVLEnvironment = (I2.get("VL") + I4.get("VL") + I6.get("VL") + I14.get("VL") + I16.get("VL")+ I17.get("VL") + I18.get("VL")+ I19.get("VL") + I22.get("VL")) / 9;

        double score = (MVHEnvironment * 10) + (MHEnvironment * 8) + (MMEnvironment * 5) + (MLEnvironment * 3) + (MVLEnvironment * 1);

        return (int) Math.round(score);
    
    
    }
    
    
    
    public int getCostScore(){
    
        //indicator 2, 20
        
     

        MVHCost = (I2.get("VH") + I20.get("VH") ) / 2;
        MHCost = (I2.get("H") + I20.get("H") ) / 2;
        MMCost= (I2.get("M") + I20.get("M") ) / 2;
        MLCost = (I2.get("L") + I20.get("L") ) / 2;
        MVLCost = (I2.get("VL") + I20.get("VL") ) / 2;

        double score = (MVHCost * 10) + (MHCost * 8) + (MMCost * 5) + (MLCost * 3) + (MVLCost * 1);

        
        return (int) Math.round(score);
    
    
    }
    
    
    public int getAvailabilityScore(){
        
        //indicator 2, 21
    
  

        MVHAvailability = (I2.get("VH") + I21.get("VH") ) / 2;
        MHAvailability = (I2.get("H") + I21.get("H") ) / 2;
        MMAvailability = (I2.get("M") + I21.get("M") ) / 2;
        MLAvailability = (I2.get("L") + I21.get("L") ) / 2;
        MVLAvailability = (I2.get("VL") + I21.get("VL") ) / 2;

        double score = (MVHAvailability * 10) + (MHAvailability * 8) + (MMAvailability * 5) + (MLAvailability * 3) + (MVLAvailability * 1);

        return (int) Math.round(score);
    }
    
    
    public LOSResult getLOS(){
    
        double LOSVH = (MVHAvailability+MVHCapacity+MVHCost+MVHEnvironment+MVHQuality+MVHQuantity+MVHReliability+MVHResponse+MVHSafety)/9 ;
        double LOSH = (MHAvailability+MHCapacity+MHCost+MHEnvironment+MHQuality+MHQuantity+MHReliability+MHResponse+MHSafety)/9 ;
        double LOSM = (MMAvailability+MMCapacity+MMCost+MMEnvironment+MMQuality+MMQuantity+MMReliability+MMResponse+MMSafety)/9 ;
        double LOSL = (MLAvailability+MLCapacity+MLCost+MLEnvironment+MLQuality+MLQuantity+MLReliability+MLResponse+MLSafety)/9 ;
        double LOSVL = (MVLAvailability+MVLCapacity+MVLCost+MVLEnvironment+MVLQuality+MVLQuantity+MVLReliability+MVLResponse+MVLSafety)/9 ;

        ArrayList<Double> LOSList = new ArrayList<>();
        
        LOSList.add(LOSVH);
        LOSList.add(LOSH);
        LOSList.add(LOSM);
        LOSList.add(LOSL);
        LOSList.add(LOSVL);
        
        //for(double x: LOSList){System.out.println(x);}
        
        System.out.println(MVHCost+MVHAvailability);

        Double BuildingLOS = (double)Collections.max(LOSList);
        LOSResult result = new LOSResult();
        
        if (BuildingLOS == LOSVH) {
            result.setDescription("Very High");
            result.setValue(BuildingLOS);
        } else if (BuildingLOS == LOSH) {
            result.setDescription("High");
            result.setValue(BuildingLOS);
        } else if (BuildingLOS == LOSM) {
            result.setDescription("Medium");
            result.setValue(BuildingLOS);
        } else if (BuildingLOS == LOSL) {
            result.setDescription("Low");
            result.setValue(BuildingLOS);
        } else if (BuildingLOS == LOSVL) {
            result.setDescription("Very Low");
            result.setValue(BuildingLOS);
        }
         
        return result;
        
    }
    
    
}
