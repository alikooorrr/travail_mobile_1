package ca.ulaval.ima.tp1;

import android.os.Parcel;
import android.os.Parcelable;

public class Profil implements Parcelable {

    private String nom;
    private String prenom;
    private String idul;
    private String ddn;

    protected Profil(Parcel in) {
        nom = in.readString();
        prenom = in.readString();
        ddn = in.readString();
        idul = in.readString();
    }

    public static final Creator<Profil> CREATOR = new Creator<Profil>() {
        @Override
        public Profil createFromParcel(Parcel in) {
            return new Profil(in);
        }

        @Override
        public Profil[] newArray(int size) {
            return new Profil[size];
        }
    };

    public String getNom(){
        return nom;
    }

    public String getPrenom(){
        return prenom;
    }

    public String getDdn(){ return ddn;  }

    public String getIdul(){
        return idul;
    }


    public Profil(String nom, String prenom, String ddn, String idul){
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = ddn;
        this.idul = idul;

    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nom);
        dest.writeString(prenom);
        dest.writeString(ddn);
        dest.writeString(idul);
    }
}
