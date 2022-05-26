package coocent.musiclibrary.music.helpers;

import android.os.Parcel;
import android.os.Parcelable;
import coocent.musiclibrary.music.p292j.C7382d;

public class MusicPlaybackTrack implements Parcelable {
    public static final Parcelable.Creator<MusicPlaybackTrack> CREATOR = new C7373a();

    /* renamed from: g */
    public long f32447g;

    /* renamed from: h */
    public long f32448h;

    /* renamed from: i */
    public C7382d.C7386d f32449i;

    /* renamed from: j */
    public int f32450j;

    /* renamed from: coocent.musiclibrary.music.helpers.MusicPlaybackTrack$a */
    class C7373a implements Parcelable.Creator<MusicPlaybackTrack> {
        C7373a() {
        }

        /* renamed from: a */
        public MusicPlaybackTrack createFromParcel(Parcel parcel) {
            return new MusicPlaybackTrack(parcel);
        }

        /* renamed from: b */
        public MusicPlaybackTrack[] newArray(int i) {
            return new MusicPlaybackTrack[i];
        }
    }

    public MusicPlaybackTrack(Parcel parcel) {
        this.f32447g = parcel.readLong();
        this.f32448h = parcel.readLong();
        this.f32449i = C7382d.C7386d.getTypeById(parcel.readInt());
        this.f32450j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        MusicPlaybackTrack musicPlaybackTrack;
        if (!(obj instanceof MusicPlaybackTrack) || (musicPlaybackTrack = (MusicPlaybackTrack) obj) == null) {
            return super.equals(obj);
        }
        return this.f32447g == musicPlaybackTrack.f32447g && this.f32448h == musicPlaybackTrack.f32448h && this.f32449i == musicPlaybackTrack.f32449i && this.f32450j == musicPlaybackTrack.f32450j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f32447g);
        parcel.writeLong(this.f32448h);
        parcel.writeInt(this.f32449i.mId);
        parcel.writeInt(this.f32450j);
    }
}
