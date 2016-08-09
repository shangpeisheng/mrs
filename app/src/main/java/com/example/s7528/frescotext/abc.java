package com.example.s7528.frescotext;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by s7528 on 2016/08/09.
 */
public class abc implements Parcelable {
    public String name;
    public String id;
    public String address;

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.id);
        dest.writeString(this.address);
    }

    public abc() {
    }

    protected abc(Parcel in) {
        this.name = in.readString();
        this.id = in.readString();
        this.address = in.readString();
    }

    public static final Parcelable.Creator<abc> CREATOR = new Parcelable.Creator<abc>() {
        @Override
        public abc createFromParcel(Parcel source) {
            return new abc(source);
        }

        @Override
        public abc[] newArray(int size) {
            return new abc[size];
        }
    };

}
