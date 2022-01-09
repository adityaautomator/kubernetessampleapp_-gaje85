import { Component, OnInit } from '@angular/core';
import { SiteService } from '../site.service';

@Component({
  selector: 'app-list-sites',
  templateUrl: './list-sites.component.html',
  styleUrls: ['./list-sites.component.css']
})
export class ListSitesComponent implements OnInit {

  constructor(private siteService:SiteService) { }

  ngOnInit(): void {
    this.loadSites();
  }

  sites:any;

  loadSites(){
    this.siteService.getSites().subscribe(res=>{
      this.sites = res;
    })
  }

}
