import { Injectable } from '@angular/core';
import { HttpClient } from "@angular/common/http";
import { Observable } from "rxjs";
import { TestDTO } from "../models/test-dto";

@Injectable({
  providedIn: 'root'
})
export class TestServiceService {

  private readonly url: string;

  constructor(private http: HttpClient) {
    this.url = 'http://localhost:9000/api';
  }

  public ping$(): Observable<TestDTO> {
    return this.http.get<TestDTO>(this.url + '/ping');
  }
}
