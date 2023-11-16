import { Controller } from "@hotwired/stimulus";
import { Chart } from "chart.js";


export default class extends Controller {
  static targets = ['insertChart'];

  connect() {
    // TODO: console.log something!
    // eslint-disable
    const worldPopulation = {
      men: 504,
      women: 496
    };

    console.log(worldPopulation);
    console.log(this.insertChartTarget);

    const keys = Object.keys(worldPopulation);
    const values = Object.values(worldPopulation);
    console.log(keys);
    console.log(values);

    const chart = {
      type: 'doughnut',
      data: {
        labels: keys,
        datasets: [{
          label: 'Gender Ratio',
          data: values,
          backgroundColor: [
            'rgb(255, 99, 132)',
            'rgb(54, 162, 235)',
            'rgb(255, 205, 86)'
          ],
          hoverOffset: 4
        }]
      }
    };
    // eslint-disable-next-line
    new Chart(this.insertChartTarget, chart);
  }
}
