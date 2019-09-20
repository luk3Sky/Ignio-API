import { NgModule, CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { RouterModule } from '@angular/router';

import { IgniogatewaySharedModule } from 'app/shared';
import {
  DeviceComponent,
  DeviceDetailComponent,
  DeviceUpdateComponent,
  DeviceDeletePopupComponent,
  DeviceDeleteDialogComponent,
  deviceRoute,
  devicePopupRoute
} from './';

const ENTITY_STATES = [...deviceRoute, ...devicePopupRoute];

@NgModule({
  imports: [IgniogatewaySharedModule, RouterModule.forChild(ENTITY_STATES)],
  declarations: [DeviceComponent, DeviceDetailComponent, DeviceUpdateComponent, DeviceDeleteDialogComponent, DeviceDeletePopupComponent],
  entryComponents: [DeviceComponent, DeviceUpdateComponent, DeviceDeleteDialogComponent, DeviceDeletePopupComponent],
  schemas: [CUSTOM_ELEMENTS_SCHEMA]
})
export class DevicedataserviceDeviceModule {}
