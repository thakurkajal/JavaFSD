import { ComponentFixture, TestBed } from '@angular/core/testing';

import { WorkoutANDuserComponent } from './workout-anduser.component';

describe('WorkoutANDuserComponent', () => {
  let component: WorkoutANDuserComponent;
  let fixture: ComponentFixture<WorkoutANDuserComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ WorkoutANDuserComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(WorkoutANDuserComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
