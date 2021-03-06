/*
 * Copyright (c) 2015 Zetra.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package id.zelory.tanipedia.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by zetbaitsu on 4/23/2015.
 */
public class PakTani implements Parcelable
{
    public static final String LOGIN_API = "http://apitanipedia.appspot.com/login?";
    public static final String REGISTER_API = "http://apitanipedia.appspot.com/register?";

    private String email;
    private String nama;
    private String password;

    public PakTani()
    {

    }

    private PakTani(Parcel in)
    {
        email = in.readString();
        nama = in.readString();
        password = in.readString();
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getNama()
    {
        return nama;
    }

    public void setNama(String nama)
    {
        this.nama = nama;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    @Override
    public int describeContents()
    {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(email);
        parcel.writeString(nama);
        parcel.writeString(password);
    }

    public static final Creator<PakTani> CREATOR
            = new Creator<PakTani>()
    {
        public PakTani createFromParcel(Parcel in)
        {
            return new PakTani(in);
        }

        public PakTani[] newArray(int size)
        {
            return new PakTani[size];
        }
    };
}
