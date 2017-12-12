var marksCanvas = document.getElementById("marksChart");

var marksData = {
  labels: ["Safety", "Quality", "Quantity", "Capacity", "Reliability", "Responsiveness","Environment Acceptability","Cost", "Availability"],
  datasets: [{
    label: "Parameters",
    backgroundColor: "rgba(79,72,218,0.5)",
    data: [0, 0, 0, 0, 0, 0,0,0,0]
  }]//, {
//    label: "Student B",
//    backgroundColor: "rgba(0,0,200,0.2)",
//    data: [54, 65, 60, 70, 70, 75]
//  }]
};

var radarChart = new Chart(marksCanvas, {
  type: 'radar',
  data: marksData
});

