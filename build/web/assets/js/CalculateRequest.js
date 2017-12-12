/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

$(document).ready(function ()
{
    var jsonObject;
    var calculateButton = $('#calculateBtn');
    calculateButton.click(function ()
    {
        // jsonObject =  $('').val(); 
        
   var $nonempty = $('.para').filter(function() {return this.value === '';});
alert($nonempty.length);
  if ($nonempty.length > 0)
  {
      $( "#dialog" ).dialog();
  }
 else{
     
    // alert('else block');
     
        var protectionLB = $('#protectionLB').val();
        var protectionUB = $('#protectionUB').val();
        
        var userSatisfactionLB = $('#userSatisfactionLB').val();
        var userSatisfactionUB = $('#userSatisfactionUB').val();
        
        var airQualityLB = $('#airQualityLB').val();
        var airQualityUB = $('#airQualityUB').val();
        
        var thermalComfortLB = $('#thermalComfortLB').val();
        var thermalComfortUB = $('#thermalComfortUB').val();
        
        var cleanlinessLB = $('#cleanlinessLB').val();
        var cleanlinessUB = $('#cleanlinessUB').val();

        var noiseQualtyLB = $('#noiseQualityLB').val();
        var noiseQualtyUB = $('#noiseQualityUB').val();

        var luminanceLB = $('#luminanceLB').val();
        var luminanceUB = $('#luminanceUB').val();


        var buildingAmenitiesLB = $('#buildingAmenitiesLB').val();
        var buildingAmenitiesUB = $('#buildingAmenitiesUB').val();

        var equipmentConditionLB = $('#equipmentConditionLB').val();
        var equipmentConditionUB = $('#equipmentConditionUB').val();

        var accessServiceLB = $('#accessServiceLB').val();
        var accessServiceUB = $('#accessServiceUB').val();


        var safetyIncidentsLB = $('#safetyIncidentsLB').val();
        var safetyIncidentsUB = $('#safetyIncidentsUB').val();


        var serviceInterruptionsLB = $('#serviceInterruptionsLB').val();
        var serviceInterruptionsUB = $('#serviceInterruptionsUB').val();

        var noServiceInterruptionsLB = $('#noServiceInterruptionsLB').val();
        var noServiceInterruptionsUB = $('#noServiceInterruptionsUB').val();


        var waterQualityLB = $('#waterQualityLB').val();
        var waterQualityUB = $('#waterQualityUB').val();


        var energyIntensityLB = $('#energyIntensityLB').val();
        var energyIntensityUB = $('#energyIntensityUB').val();


        var energyConsumptionLB = $('#energyConsumptionLB').val();
        var energyConsumptionUB = $('#energyConsumptionUB').val();

        var ghgReductionLB = $('#ghgReductionLB').val();
        var ghgReductionUB = $('#ghgReductionUB').val();

        var waterConsumptionLB = $('#waterConsumptionLB').val();
        var waterConsumptionUB = $('#waterConsumptionUB').val();

        var recycledWaterLB = $('#recycledWaterLB').val();
        var recycledWaterUB = $('#recycledWaterUB').val();

        var opCostLB = $('#opCostLB').val();
        var opCostUB = $('#opCostUB').val();

        var amenityDisabilityLB = $('#amenityDisabilityLB').val();
        var amenityDisabilityUB = $('#amenityDisabilityUB').val();

        var cyclingonvenieceLB = $('#cyclingConvenienceLB').val();
        var cyclingonvenieceUB = $('#cyclingConvenienceUB').val();
        
        
      /*  jsonObject = '{"parameters" : [\n\
{"protectionLB" : '+protectionLB+' , "protectionUB" : '+protectionUB+'}\n\
{"userSatisfactionLB" : '+userSatisfactionLB+' , "userSatisfactionUB" : '+userSatisfactionUB+'}\n\
{"airQualityLB" : '+airQualityLB+' , "airQualityUB" : '+airQualityUB+'}\n\
{"thermalComfortLB" : '+thermalComfortLB+' , "thermalComfortUB" : '+thermalComfortUB+'}\n\
{"protectionLB" : '+protectionLB+' , "protectionUB" : '+protectionUB+'}\n\
{"protectionLB" : '+protectionLB+' , "protectionUB" : '+protectionUB+'}\n\
{"protectionLB" : '+protectionLB+' , "protectionUB" : '+protectionUB+'}\n\
]}';*/
        
        jsonObject = {protectionLB :protectionLB , protectionUB : protectionUB ,
                       userSatisfactionLB : userSatisfactionLB , userSatisfactionUB : userSatisfactionUB , 
                       airQualityLB :airQualityLB , airQualityUB : airQualityUB ,
                       thermalComfortLB : thermalComfortLB , thermalComfortUB : thermalComfortUB , 
                       cleanlinessLB : cleanlinessLB , cleanlinessUB : cleanlinessUB , 
                       noiseQualtyLB : noiseQualtyLB , noiseQualtyUB : noiseQualtyUB ,
                       luminanceLB : luminanceLB , luminanceUB : luminanceUB , 
                       buildingAmenitiesLB : buildingAmenitiesLB , buildingAmenitiesUB :buildingAmenitiesUB , 
                       equipmentConditionLB : equipmentConditionLB , equipmentConditionUB : equipmentConditionUB , 
                       accessServiceLB : accessServiceLB , accessServiceUB : accessServiceUB , 
                       safetyIncidentsLB : safetyIncidentsLB , safetyIncidentsUB : safetyIncidentsUB , 
                       serviceInterruptionsLB : serviceInterruptionsLB , serviceInterruptionsUB : serviceInterruptionsUB , 
                       noServiceInterruptionsLB : noServiceInterruptionsLB , noServiceInterruptionsUB : noServiceInterruptionsUB , 
                       waterQualityLB : waterQualityLB , waterQualityUB : waterQualityUB , 
                       energyIntensityLB : energyIntensityLB , energyIntensityUB : energyIntensityUB , 
                       energyConsumptionLB : energyConsumptionLB , energyConsumptionUB : energyConsumptionUB ,
                       ghgReductionLB : ghgReductionLB , ghgReductionUB : ghgReductionUB , 
                       waterConsumptionLB : waterConsumptionLB , waterConsumptionUB : waterConsumptionUB , 
                       recycledWaterLB : recycledWaterLB , recycledWaterUB : recycledWaterUB , 
                       opCostLB : opCostLB , opCostUB : opCostUB , 
                       amenityDisabilityLB : amenityDisabilityLB , amenityDisabilityUB : amenityDisabilityUB , 
                       cyclingonvenieceLB : cyclingonvenieceLB , cyclingonvenieceUB : cyclingonvenieceUB};

   
  
    
    	$.ajax({
			url : 'calculate',
			data : jsonObject,
                        dataType: 'json',
                        type: 'POST',
			success : function(data) 
                        {
                        alert(data.LOS);
			var marksCanvas = document.getElementById("marksChart");
                        marksCanvas.innerHTML = "";

                var marksData = {
                    labels: ["Safety", "Quality", "Quantity", "Capacity", "Reliability", "Responsiveness", "Environment Acceptability", "Cost", "Availability"],
                    datasets: [{
                            label: "Parameters",
                            backgroundColor: "rgba(79,72,218,0.5)",
                            data: [data.safety, data.quality, data.quantity, data.capacity, data.reliability, data.responsiveness, data.environment, data.cost, data.availability]
                        }]
                };

                var radarChart = new Chart(marksCanvas, {
                    type: 'radar',
                    data: marksData
                });
                
                var LOSPosition = document.getElementById("LOS");
                LOSPosition.innerHTML = "";
                LOSPosition.innerHTML= data.LOS;
	
			}
		});
                
    }
    
    });
    





}
);
