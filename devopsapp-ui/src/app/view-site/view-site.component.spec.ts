import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewSiteComponent } from './view-site.component';

describe('ViewSiteComponent', () => {
  let component: ViewSiteComponent;
  let fixture: ComponentFixture<ViewSiteComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewSiteComponent ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewSiteComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
