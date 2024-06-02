import { Component } from '@angular/core';
import { MatDialog } from '@angular/material/dialog';
import { DonoarRegistrationComponent } from 'src/app/pages/pages/donoar-registration/donoar-registration.component';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.scss']
})
export class HeaderComponent {
  constructor(public dialog: MatDialog) {}

  openDonarRegistration() {
    const dialogRef = this.dialog.open(DonoarRegistrationComponent,{
      width: '600px',
    });

    dialogRef.afterClosed().subscribe(result => {
      console.log(`Dialog result: ${result}`);
    });
  }
}

