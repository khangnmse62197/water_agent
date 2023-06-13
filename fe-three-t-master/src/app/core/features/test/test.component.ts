import { Component, OnInit } from '@angular/core';
import { TestServiceService } from "../../services/test-service.service";
import { Observable } from "rxjs";
import { TestDTO } from "../../models/test-dto";

@Component({
  selector: 'app-test',
  templateUrl: './test.component.html',
  styleUrls: ['./test.component.scss']
})
export class TestComponent implements OnInit {

  public pong$: Observable<TestDTO>;
  constructor(private readonly testService: TestServiceService) {
    this.pong$ = testService.ping$();
  }

  ngOnInit(): void {
  }

}
