package tomtom;

public class Address {
    private String streetNumber;
    private String streetName;
    private String municipalitySubdivision;
    private String municipality;
    private String countrySecondarySubdivision;
    private String countrySubdivision;
    private String postalCode;
    private String countryCode;
    private String country;
    private String countryCodeISO3;
    private String freeformAddress;

    public Address(String streetNumber, String streetName, String municipalitySubdivision, String municipality, String countrySecondarySubdivision, String countrySubdivision, String postalCode, String countryCode, String country, String countryCodeISO3, String freeformAddress) {
        this.streetNumber = streetNumber;
        this.streetName = streetName;
        this.municipalitySubdivision = municipalitySubdivision;
        this.municipality = municipality;
        this.countrySecondarySubdivision = countrySecondarySubdivision;
        this.countrySubdivision = countrySubdivision;
        this.postalCode = postalCode;
        this.countryCode = countryCode;
        this.country = country;
        this.countryCodeISO3 = countryCodeISO3;
        this.freeformAddress = freeformAddress;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getMunicipalitySubdivision() {
        return municipalitySubdivision;
    }

    public void setMunicipalitySubdivision(String municipalitySubdivision) {
        this.municipalitySubdivision = municipalitySubdivision;
    }

    public String getMunicipality() {
        return municipality;
    }

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    public String getCountrySecondarySubdivision() {
        return countrySecondarySubdivision;
    }

    public void setCountrySecondarySubdivision(String countrySecondarySubdivision) {
        this.countrySecondarySubdivision = countrySecondarySubdivision;
    }

    public String getCountrySubdivision() {
        return countrySubdivision;
    }

    public void setCountrySubdivision(String countrySubdivision) {
        this.countrySubdivision = countrySubdivision;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountryCodeISO3() {
        return countryCodeISO3;
    }

    public void setCountryCodeISO3(String countryCodeISO3) {
        this.countryCodeISO3 = countryCodeISO3;
    }

    public String getFreeformAddress() {
        return freeformAddress;
    }

    public void setFreeformAddress(String freeformAddress) {
        this.freeformAddress = freeformAddress;
    }
}
