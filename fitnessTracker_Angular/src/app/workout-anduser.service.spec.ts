import { TestBed } from '@angular/core/testing';

import { WorkoutANDuserService } from './workout-anduser.service';

describe('WorkoutANDuserService', () => {
  let service: WorkoutANDuserService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(WorkoutANDuserService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
