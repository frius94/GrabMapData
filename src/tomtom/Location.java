package tomtom;

import location.Results;

import java.util.ArrayList;

public class Location {
    private Summary summary;
    private ArrayList<Results> results;

    public Location(Summary summary, ArrayList<Results> results) {
        this.summary = summary;
        this.results = results;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public ArrayList<Results> getResults() {
        return results;
    }

    public void setResults(ArrayList<Results> results) {
        this.results = results;
    }

    public void printInformation() {

        if (this.getResults().size() == 0) {
            System.out.println("Zu deiner Suchanfrage wurden leider keine Ergebnisse gefunden.");
        } else {

            System.out.println("----------ERGEBNISSE----------");
            for (Results r : this.getResults()) {
                if (r.getAddress().getStreetName() != null)
                    System.out.print("Strasse: " + r.getAddress().getStreetName());
                if (r.getAddress().getStreetNumber() != null) {
                    System.out.println(" " + r.getAddress().getStreetNumber());
                } else {
                    System.out.println();
                }
                if (r.getAddress().getMunicipality() != null)
                    System.out.println("Gemeinde: " + r.getAddress().getMunicipality());
                if (r.getAddress().getMunicipalitySubdivision() != null)
                    System.out.println("Ort: " + r.getAddress().getMunicipalitySubdivision());
                if (r.getAddress().getCountrySecondarySubdivision() != null)
                    System.out.println("Bezirk: " + r.getAddress().getCountrySecondarySubdivision());
                if (r.getAddress().getCountrySubdivision() != null)
                    System.out.println("Kanton: " + r.getAddress().getCountrySubdivision());
                if (r.getAddress().getPostalCode() != null)
                    System.out.println("Postleitzahl: " + r.getAddress().getPostalCode());
                if (r.getAddress().getCountryCode() != null)
                    System.out.println("Land-Kennzeichen: " + r.getAddress().getCountryCode());
                if (r.getAddress().getCountry() != null)
                    System.out.println("Land: " + r.getAddress().getCountry());
                System.out.println("Breitengrad: " + r.getPosition().getLat());
                System.out.println("Längengrad: " + r.getPosition().getLon());
                System.out.println("------------------------------");
            }
        }
    }
}
