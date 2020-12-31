export class Satellite {
  name: string;
  type: string;
  launchDate: string;
  orbitType: string;
  operational: boolean;

  constructor(
    name: string,
    type: string,
    launchDate: string,
    orbitType: string,
    operational: boolean
    ){
    this.name = name;
    this.type = type;
    this.launchDate = launchDate;
    this.orbitType = orbitType;
    this.operational = operational;
  }

  shouldShowWarning(type){
    let theType = 'Space Debris';
    if ((this.type).toLowerCase() === theType.toLowerCase()) {
      return true;
    } return false;
  }
}
