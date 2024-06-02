import { ComponentFixture, TestBed } from '@angular/core/testing';

import { DonoarRegistrationComponent } from './donoar-registration.component';

describe('DonoarRegistrationComponent', () => {
  let component: DonoarRegistrationComponent;
  let fixture: ComponentFixture<DonoarRegistrationComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [DonoarRegistrationComponent]
    });
    fixture = TestBed.createComponent(DonoarRegistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
