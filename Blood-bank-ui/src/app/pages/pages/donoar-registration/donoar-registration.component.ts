import { registerLocaleData } from '@angular/common';
import { HttpClient } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormGroup, FormBuilder, FormArray, FormControl, Validators } from '@angular/forms';

@Component({
  selector: 'app-donoar-registration',
  templateUrl: './donoar-registration.component.html',
  styleUrls: ['./donoar-registration.component.scss']
})
export class DonoarRegistrationComponent {
  donarRegistrationForm:FormGroup | any = new FormGroup({});
  bloodGroup:any[]=[];
  defaultValueOfBloodType:any
  constructor(private fb:FormBuilder,private http:HttpClient)
  {        
    this.donarRegistrationForm=fb.group({
      name:[''],
      bloodType:[''],
      contactNumber:[''],
      email:[''],
      address:fb.group({
        street:[''],
        city:[''],
        state:[''],
        postalCode:[''],
        country:['']
      }),
      diseases:fb.array([this.diseaseBody()])
    })
  }

  diseaseBody(){
    return this.fb.group({
      diseaseName: new FormControl('',[Validators.required])
    });
  }

  addDiseaseBody()
  {
    const control=this.donarRegistrationForm.get('diseases') as FormArray;
    console.log(control);
    
    control.push(this.diseaseBody())
  }

  deleteDiseaseBody(index:any)
  {
    const control=this.donarRegistrationForm.get('diseases') as FormArray;
   control.removeAt(index)
  }
  delete(index:any)
  {
    const control=this.donarRegistrationForm.get('diseases') as FormArray
    return control.length>1
  }

  submit()
  {
    this.http.post(`http://localhost:8080/donor/register`,this.donarRegistrationForm.value).subscribe((res:any)=>{
      console.log(res);
      
    })
    
  }

  ngOnInit()
  {
    this.chooseBloodGroup()
  }

  chooseBloodGroup() {
    this.http.get(`http://localhost:8080/bloodGroups`).subscribe((res: any) => {
      this.bloodGroup = res;
      if (this.bloodGroup.length > 0) {
        this.donarRegistrationForm.get('bloodType').setValue(this.bloodGroup[0]);
      }
    });
  }

}

