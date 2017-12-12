/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


  FusionCharts.ready(function(){
    var fusioncharts = new FusionCharts({
    type: 'hlineargauge',
    renderAt: 'chart-container',
    id: 'cpu-linear-gauge',
    width: '500',
    height: '140',
    dataFormat: 'json',
    dataSource: {
        "chart": {
            "theme": "fint",
            "caption": "Building LOS",
            "subcaption": "",
            "lowerLimit": "0",
            "upperLimit": "100",
             "numberSuffix": "%",
            "chartBottomMargin": "40",
            "valueFontSize": "11",
            "valueFontBold": "0"
        },
        "colorRange": {
            "color": [{
                "minValue": "0",
                "maxValue": "35",
                "label": "Poor",
            }, {
                "minValue": "35",
                "maxValue": "70",
                "label": "Moderate",
            }, {
                "minValue": "70",
                "maxValue": "100",
                "label": "Excellent",
            }]
        },
        "pointers": {
            "pointer": [{
                "value": "50"
            }]
        },
        "trendPoints": {
            "point": [
                //Trendpoint
                {
                    "startValue": "70",
                    "displayValue": " ",
                    "dashed": "1",
                    "showValues": "0"
                }, {
                    "startValue": "85",
                    "displayValue": " ",
                    "dashed": "1",
                    "showValues": "0"
                },
                //Trendzone
                {
                    "startValue": "70",
                    "endValue": "85",
                    "displayValue": " ",
                    "alpha": "40"
                }
            ]
        },
        "annotations": {
            "origw": "400",
            "origh": "190",
            "autoscale": "1",
            "groups": [{
                "id": "range",
                "items": [{
                    "id": "rangeBg",
                    "type": "rectangle",
                    "x": "$chartCenterX-115",
                    "y": "$chartEndY-35",
                    "tox": "$chartCenterX +115",
                    "toy": "$chartEndY-15",
                    "fillcolor": "#0075c2"
                }, {
                    "id": "rangeText",
                    "type": "Text",
                    "fontSize": "11",
                    "fillcolor": "#ffffff",
                    "text": "Recommended Building LOS : 70% - 85%",
                    "x": "$chartCenterX",
                    "y": "$chartEndY-25"
                }]
            }]
        }
    }
}
);
    fusioncharts.render();
});