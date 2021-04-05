import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LoginCopyComponent } from './login-Copy.component';

describe('LoginCopyComponent', () => {
  let component: LoginCopyComponent;
  let fixture: ComponentFixture<LoginCopyComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ LoginCopyComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(LoginCopyComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
