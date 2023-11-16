import { Controller } from "@hotwired/stimulus";

export default class extends Controller {
  connect() {
    // TODO: console.log something!
    console.log('It is properly connected');
  }

  disable() {
    this.element.setAttribute('disabled', '');
    this.element.innerHTML = 'Bingo!';
    const audioTrack = new Audio('../sound.mp3');
    audioTrack.play();
  }
}
