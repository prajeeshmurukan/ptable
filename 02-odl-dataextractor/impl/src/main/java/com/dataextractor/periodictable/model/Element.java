package com.dataextractor.periodictable.model;

public class Element {
	// Total attributes 23
	private String  atomicNumber  = "N/A";	
	private String  element	= "N/A" ;
	private String  symbol	= "N/A" ;
	private String  atomicweight	= "N/A" ;
	private String  period	= "N/A";
	private String  group	= "N/A";
	private String  phase	= "N/A" ;
	private String  mostStableCrystal = "N/A" ; 
	private String  type	= "N/A" ;
	private String  ionicRadius	="N/A";
	private String  atomicRadius	= "N/A";
	private String  electronegativity	="N/A";
	private String  firstIonizationPotential	 = "N/A";
	private String  density	 = "N/A";
	private String  meltingPointK	 ="N/A";
	private String  boilingPointk	= "N/A";
	private String isotopes	= "N/A";
	private String  discoverer	= "N/A" ;
	private String  yearofDiscovery	= "N/A" ;
	private String  specificHeatCapacity = "N/A";	
	private String  electronConfiguration	= "N/A" ; 
	private String displayRow	="N/A";
	private String displayColumn ="N/A";


	public String getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(String atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public String getAtomicweight() {
		return atomicweight;
	}

	public void setAtomicweight(String atomicweight) {
		this.atomicweight = atomicweight;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}

	public String getPhase() {
		return phase;
	}

	public void setPhase(String phase) {
		this.phase = phase;
	}

	public String getMostStableCrystal() {
		return mostStableCrystal;
	}

	public void setMostStableCrystal(String mostStableCrystal) {
		this.mostStableCrystal = mostStableCrystal;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIonicRadius() {
		return ionicRadius;
	}

	public void setIonicRadius(String ionicRadius) {
		this.ionicRadius = ionicRadius;
	}

	public String getAtomicRadius() {
		return atomicRadius;
	}

	public void setAtomicRadius(String atomicRadius) {
		this.atomicRadius = atomicRadius;
	}

	public String getElectronegativity() {
		return electronegativity;
	}

	public void setElectronegativity(String electronegativity) {
		this.electronegativity = electronegativity;
	}

	public String getFirstIonizationPotential() {
		return firstIonizationPotential;
	}

	public void setFirstIonizationPotential(String firstIonizationPotential) {
		this.firstIonizationPotential = firstIonizationPotential;
	}

	public String getDensity() {
		return density;
	}

	public void setDensity(String density) {
		this.density = density;
	}

	public String getMeltingPointK() {
		return meltingPointK;
	}

	public void setMeltingPointK(String meltingPointK) {
		this.meltingPointK = meltingPointK;
	}

	public String getBoilingPointk() {
		return boilingPointk;
	}

	public void setBoilingPointk(String boilingPointk) {
		this.boilingPointk = boilingPointk;
	}

	public String getIsotopes() {
		return isotopes;
	}

	public void setIsotopes(String isotopes) {
		this.isotopes = isotopes;
	}

	public String getDiscoverer() {
		return discoverer;
	}

	public void setDiscoverer(String discoverer) {
		this.discoverer = discoverer;
	}

	public String getYearofDiscovery() {
		return yearofDiscovery;
	}

	public void setYearofDiscovery(String yearofDiscovery) {
		this.yearofDiscovery = yearofDiscovery;
	}

	public String getSpecificHeatCapacity() {
		return specificHeatCapacity;
	}

	public void setSpecificHeatCapacity(String specificHeatCapacity) {
		this.specificHeatCapacity = specificHeatCapacity;
	}

	public String getElectronConfiguration() {
		return electronConfiguration;
	}

	public void setElectronConfiguration(String electronConfiguration) {
		this.electronConfiguration = electronConfiguration;
	}

	public String getDisplayRow() {
		return displayRow;
	}

	public void setDisplayRow(String displayRow) {
		this.displayRow = displayRow;
	}

	public String getDisplayColumn() {
		return displayColumn;
	}

	public void setDisplayColumn(String displayColumn) {
		this.displayColumn = displayColumn;
	}

	public Element() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}


	@Override
	public boolean equals(Object arg0) {
		// TODO Auto-generated method stub
		return super.equals(arg0);
	}


	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}


	@Override
	public String toString() {
		return "Element [atomicNumber=" + atomicNumber + ", element=" + element + ", symbol=" + symbol
				+ ", atomicweight=" + atomicweight + ", period=" + period + ", group=" + group + ", phase=" + phase
				+ ", mostStableCrystal=" + mostStableCrystal + ", type=" + type + ", ionicRadius=" + ionicRadius
				+ ", atomicRadius=" + atomicRadius + ", electronegativity=" + electronegativity
				+ ", firstIonizationPotential=" + firstIonizationPotential + ", density=" + density + ", meltingPointK="
				+ meltingPointK + ", boilingPointk=" + boilingPointk + ", isotopes=" + isotopes + ", discoverer="
				+ discoverer + ", yearofDiscovery=" + yearofDiscovery + ", specificHeatCapacity=" + specificHeatCapacity
				+ ", electronConfiguration=" + electronConfiguration + ", displayRow=" + displayRow + ", displayColumn="
				+ displayColumn + "]";
	}

	

}
