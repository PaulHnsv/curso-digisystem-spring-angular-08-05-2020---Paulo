import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {
  title = 'front alterando o texto de verdade';
  minhaVariavel = 'Angular 9';
  meuTexto;

  site = 'http://grandeporte.com.br';

  getMinhaVariavel(){
    return 'Um texto';
  }

  onClick(){
    alert ('Event Binding');
  }

  onKeyup( inputText ){
    //let cor = 'yellow';
    this.meuTexto = inputText;
    console.log ( inputText );
  }

}
