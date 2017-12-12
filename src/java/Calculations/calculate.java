/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculations;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author Skane
 */
@WebServlet(name = "calculate", urlPatterns = {"/calculate"})
public class calculate extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet calculate</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet calculate at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        System.out.println("Calculations");
        Parameter values = new Parameter();
        BuildingLOS building = new BuildingLOS();
        try {
           values.setProtectionLB(Integer.parseInt(request.getParameter("protectionLB")));
           values.setProtectionUB(Integer.parseInt(request.getParameter("protectionUB")));
           values.setSatisfactionLB(Integer.parseInt(request.getParameter("userSatisfactionLB")));
           values.setSatisfactionUB(Integer.parseInt(request.getParameter("userSatisfactionUB")));
           values.setAirLB(Integer.parseInt(request.getParameter("airQualityLB")));
           values.setAirUB(Integer.parseInt(request.getParameter("airQualityUB")));
           values.setThermalLB(Integer.parseInt(request.getParameter("thermalComfortLB")));
           values.setThermalUB(Integer.parseInt(request.getParameter("thermalComfortUB")));
           values.setCleanLB(Integer.parseInt(request.getParameter("cleanlinessLB")));
           values.setCleanUB(Integer.parseInt(request.getParameter("cleanlinessUB")));
           values.setNoiseLB(Integer.parseInt(request.getParameter("noiseQualtyLB")));
           values.setNoiseUB(Integer.parseInt(request.getParameter("noiseQualtyUB")));
           values.setLuminanceLB(Integer.parseInt(request.getParameter("luminanceLB")));
           values.setLuminanceUB(Integer.parseInt(request.getParameter("luminanceUB")));
           values.setAmenetiesLB(Integer.parseInt(request.getParameter("buildingAmenitiesLB")));
           values.setAmenetiesUB(Integer.parseInt(request.getParameter("buildingAmenitiesUB")));
           values.setEquipmentLB(Integer.parseInt(request.getParameter("equipmentConditionLB")));
           values.setEquipmentUB(Integer.parseInt(request.getParameter("equipmentConditionUB")));
           values.setServiceLB(Integer.parseInt(request.getParameter("accessServiceLB")));
           values.setServiceUB(Integer.parseInt(request.getParameter("accessServiceUB")));
           values.setSafetyLB(Integer.parseInt(request.getParameter("safetyIncidentsLB")));
           values.setSafetyUB(Integer.parseInt(request.getParameter("safetyIncidentsUB")));
           values.setInterruptionsLB(Integer.parseInt(request.getParameter("serviceInterruptionsLB")));
           values.setInterruptionsUB(Integer.parseInt(request.getParameter("serviceInterruptionsUB")));
           values.setNoServiceInterruptionsLB(Integer.parseInt(request.getParameter("noServiceInterruptionsLB")));
           values.setNoServiceInterruptionsUB(Integer.parseInt(request.getParameter("noServiceInterruptionsUB")));
           values.setPoolQualityLB(Integer.parseInt(request.getParameter("waterQualityLB")));
           values.setPoolQualityUB(Integer.parseInt(request.getParameter("waterQualityUB")));
           values.setEnergyIntensityLB(Integer.parseInt(request.getParameter("energyIntensityLB")));
           values.setEnergyIntensityUB(Integer.parseInt(request.getParameter("energyIntensityUB")));
           values.setRenewableEnergyLB(Integer.parseInt(request.getParameter("energyConsumptionLB")));
           values.setRenewableEnergyUB(Integer.parseInt(request.getParameter("energyConsumptionUB")));
           values.setGhgReductionLB(Integer.parseInt(request.getParameter("ghgReductionLB")));
           values.setGhgReductionUB(Integer.parseInt(request.getParameter("ghgReductionUB")));
           values.setWaterConsumptionLB(Integer.parseInt(request.getParameter("waterConsumptionLB")));
           values.setWaterConsumptionUB(Integer.parseInt(request.getParameter("waterConsumptionUB")));
           values.setRecycledWaterLB(Integer.parseInt(request.getParameter("recycledWaterLB")));
           values.setRecycledWaterUB(Integer.parseInt(request.getParameter("recycledWaterUB")));
           values.setOpCostsLB(Integer.parseInt(request.getParameter("opCostLB")));
           values.setOpCostsUB(Integer.parseInt(request.getParameter("opCostUB")));
           values.setAmenityForDisabilityLB(Integer.parseInt(request.getParameter("amenityDisabilityLB")));
           values.setAmenityForDisabilityUB(Integer.parseInt(request.getParameter("amenityDisabilityUB")));
           values.setCyclingConvenienceUB(Integer.parseInt(request.getParameter("cyclingonvenieceUB")));
           values.setCyclingConvenienveLB(Integer.parseInt(request.getParameter("cyclingonvenieceLB")));
           
            System.out.println(request.getParameter("protectionLB"));
            
           building.setMemberships(values);
          
           
           int safety = building.getSafetyScore();
           int quality = building.getQualityScore();
           int quantity = building.getQuantityScore();
           int capacity = building.getCapacityScore();
           int reliability = building.getReliabilityScore();
           int responsiveness = building.getResponsivenessScore();
           int environment = building.getEnvironmentAcceptabilityScore();
           int cost = building.getCostScore();
           int availability = building.getAvailabilityScore();
           
           LOSResult LOS = building.getLOS();
           
            System.out.println("safety is "+ safety);
            System.out.println("quality is "+ quality);
            System.out.println("quantity is "+ quantity);
            System.out.println("capacity is "+ capacity);
            System.out.println("reliability is "+ reliability);
            System.out.println("responsiveness is "+ responsiveness);
            System.out.println("environment is "+ environment);
            System.out.println("cost is "+ cost);
            System.out.println("availability is "+ availability);
            System.out.println("LOS is "+ LOS.getValue()+" = "+ LOS.getDescription());


      response.setContentType("application/json");
      JSONObject radarValues = new JSONObject();
      
      radarValues.put("safety", safety);
      radarValues.put("quality", quality);
      radarValues.put("quantity", quantity);
      radarValues.put("capacity", capacity);
      radarValues.put("reliability", reliability);
      radarValues.put("responsiveness", responsiveness);
      radarValues.put("environment", environment);
      radarValues.put("cost", cost);
      radarValues.put("availability", availability);
      radarValues.put("LOSValue", (int)Math.round(LOS.getValue())*100);
      radarValues.put("LOS", LOS.getDescription());
     
      
      PrintWriter out = response.getWriter();
      out.println(radarValues);
      out.close();    
            
        } catch (Exception ex) {
            Logger.getLogger(calculate.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        
        
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
