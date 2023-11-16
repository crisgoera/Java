import { Application } from "@hotwired/stimulus";


// TODO: Import Chartjs external library
// eslint-disable-next-line
import { Chart } from "chart.js";
// eslint-disable-next-line
import * as Chartjs from "chart.js";

// TODO: Import the Stimulus Controller here
// eslint-disable-next-line
import DoughnutChartController from './controllers/doughnut_chart_controller.js';
// eslint-disable-next-line
import LineChartController from './controllers/line_chart_controller.js';
// eslint-disable-next-line
import RadarChartController from './controllers/radar_chart_controller.js';

// TODO: Register all Chartjs controllers
const controllers = Object.values(Chartjs).filter(
  (chart) => chart.id !== undefined
);
Chart.register(...controllers);


// TODO: Register your Stimulus Controller below
window.Stimulus = Application.start();
window.Stimulus.register('doughnut-chart', DoughnutChartController);
window.Stimulus.register('line-chart', LineChartController);
window.Stimulus.register('radar-chart', RadarChartController);
