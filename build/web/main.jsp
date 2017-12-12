<%-- 
    Document   : main
    Created on : Sep 28, 2017, 10:59:52 PM
    Author     : Skane
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="assets/js/jquery-1.11.1.js" type="text/javascript"></script>
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
        <link rel="stylesheet" href="http://fonts.googleapis.com/css?family=Roboto:400,100,300,500">
        <link rel="stylesheet" href="assets/bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="assets/css/form-elements.css">
        <script src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.7.0/Chart.bundle.min.js"></script>
        <link href="assets/css/footer.css" rel="stylesheet" type="text/css"/>
        <link href="assets/css/home.css" rel="stylesheet" type="text/css"/>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/fusioncharts.js"></script>
        <script type="text/javascript" src="http://static.fusioncharts.com/code/latest/themes/fusioncharts.theme.fint.js?cacheBust=56"></script>
        <script src="assets/js/CalculateRequest.js" type="text/javascript"></script>
        
        <link href = "https://code.jquery.com/ui/1.10.4/themes/ui-lightness/jquery-ui.css"
         rel = "stylesheet">
      <script src = "https://code.jquery.com/jquery-1.10.2.js"></script>
      <script src = "https://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
        
        
       
    
    </head>

    <body>
        <div id="dialog" title="Missing Values">
        <p>Please make sure you have inserted all parameters.</p>
        </div> 
        
        <div class="container-fluid">
            <nav class="navbar navbar-inverse navbar-fixed-top">
                <!-- Brand and toggle get grouped for better mobile display -->
                <div class="navbar-header">
                    <button type="button" data-target="#navbarCollapse" data-toggle="collapse" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
                    <a href="#" class="navbar-brand"><strong>Building </strong>Model </a>
                </div>
                <!-- Collection of nav links, forms, and other content for toggling -->
                <div id="navbarCollapse" class="collapse navbar-collapse">
                    <ul class="nav navbar-nav ">
                        <li class="active"><a href="#">Home</a></li>
                        <li><a href="#">About Us</a></li>

                    </ul>

                    <ul class="nav navbar-nav navbar-right">
                        <li><a href="#">Logout</a></li>
                    </ul>
                </div>
            </nav>


            <div class="row" id="main_Body" style="padding-top: 70px">

                <div class="col-md-6" id="input_area">

                    <table class="table">

                        <thead>
                            <tr>
                                <th><h4>Parameter</h4></th>
                                <th><h4>Lower Limit</h4></th>
                                <th><h4>Upper Limit</h4></th>
                            </tr>

                        </thead>

                        <tbody>
                            <tr>
                                <td  bgcolor="#4771A5"><strong>Protection and Security</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="protectionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="protectionUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>User satisfaction</strong></td>

                                <td bgcolor="#479560"><input class="para" type="text" id="userSatisfactionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="userSatisfactionUB" style="height: 30px"></td>
                                </div>
                            </tr>
                            <tr>
                                <td  bgcolor="#4771A5"><strong>Indoor air quality</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="airQualityLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="airQualityUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td  bgcolor="#4771A5"><strong>Thermal comfort</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="thermalComfortLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="thermalComfortUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td  bgcolor="#4771A5"><strong>Cleanliness and visual comfort</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="cleanlinessLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="cleanlinessUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Indoor noise quality</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="noiseQualityLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="noiseQualityUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Indoor luminance level </strong></td>
                                <td bgcolor="#479560""><input class="para" type="text" id="luminanceLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="luminanceUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Building amenities</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="buildingAmenitiesLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="buildingAmenitiesUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Equipment condition</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="equipmentConditionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="equipmentConditionUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Access to service</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="accessServiceLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="accessServiceUB" style="height: 30px"></td>
                            </tr>

                            <tr>
                                <td bgcolor="#4771A5"><strong>Safety related incidents</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="safetyIncidentsLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="safetyIncidentsUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Unplanned service interruptions</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="serviceInterruptionsLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="serviceInterruptionsUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Days with no service interruptions</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="noServiceInterruptionsLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="noServiceInterruptionsUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Swimming pool water quality</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="waterQualityLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="waterQualityUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Annual energy use intensity</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="energyIntensityLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="energyIntensityUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td  bgcolor="#4771A5"><strong>Renewable energy consumption</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="energyConsumptionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="energyConsumptionUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>GHG emission reduction</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="ghgReductionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="ghgReductionUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Water consumption per user</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="waterConsumptionLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="waterConsumptionUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Percentage of recycled water</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="recycledWaterLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="recycledWaterUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Operational costs</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="opCostLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="opCostUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Amenities for disabilities</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="amenityDisabilityLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="amenityDisabilityUB" style="height: 30px"></td>
                            </tr>
                            <tr>
                                <td bgcolor="#4771A5"><strong>Cycling convenience</strong></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="cyclingConvenienceLB" style="height: 30px"></td>
                                <td bgcolor="#479560"><input class="para" type="text" id="cyclingConvenienceUB" style="height: 30px"></td>
                            </tr>
                        </tbody>


                    </table>
                    
                    
                </div>

                <div class="col-md-6" id="results">


                    <button type="button" class="btn btn-primary btn-lg pull-right" id="calculateBtn">Calculate</button>

                    <canvas id="marksChart" width="600" height="400"></canvas>

                    <script src="assets/js/Radar.js" type="text/javascript"></script>
                    
                    
                    <div class="panel panel-primary" id="panel1" style="margin-top: 50px">
                       
                        <div class="panel-body text-center"><b>Building LOS: </b><strong id="LOS"></strong></div>
                    </div>


                    <div id="chart-container" align="center">Gauge will Load here</div>
                    
                    <script src="assets/js/Gauge.js" type="text/javascript"></script>
                </div>


            </div>      


            <footer class="footer-bs">
                <div class="row">
                    <div class="col-md-3 footer-brand animated fadeInLeft">
                        <img src="assets/img/logos/logoUBC.gif" alt="" height="130px" width="100px"/>

                        <!--<p>© 2014 BS3 UI Kit, All rights reserved</p> -->
                    </div>
                    <div class="col-md-4 footer-nav animated fadeInUp">
                        <img src="assets/img/logos/bc-housing.png" alt=""/>
                    </div>
                    <div class="col-md-2 footer-social animated fadeInDown">


                    </div>
                    <div class="col-md-3 footer-ns animated fadeInRight">
                        <h4>Special Thanks</h4>
                        <p>We gratefully acknowledge the financial support of the BC housing as part of the Building Excellence Research & Education Grants Program</p>

                    </div>
                </div>
            </footer>
      
    </div>
        


    </body>
</html>
