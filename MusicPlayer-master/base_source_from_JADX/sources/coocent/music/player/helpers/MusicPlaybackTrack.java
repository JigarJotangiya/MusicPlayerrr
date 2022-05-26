package coocent.music.player.helpers;

import android.os.Parcel;
import android.os.Parcelable;
import coocent.musiclibrary.music.p292j.C7382d;

public class MusicPlaybackTrack implements Parcelable {
    public static final Parcelable.Creator<MusicPlaybackTrack> CREATOR = new C7054a();

    /* renamed from: g */
    public long f31224g;

    /* renamed from: h */
    public long f31225h;

    /* renamed from: i */
    public C7382d.C7386d f31226i;

    /* renamed from: j */
    public int f31227j;

    /* renamed from: coocent.music.player.helpers.MusicPlaybackTrack$a */
    class C7054a implements Parcelable.Creator<MusicPlaybackTrack> {
        C7054a() {
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
        this.f31224g = parcel.readLong();
        this.f31225h = parcel.readLong();
        this.f31226i = C7382d.C7386d.getTypeById(parcel.readInt());
        this.f31227j = parcel.readInt();
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        MusicPlaybackTrack musicPlaybackTrack;
        if (!(obj instanceof MusicPlaybackTrack) || (musicPlaybackTrack = (MusicPlaybackTrack) obj) == null) {
            return super.equals(obj);
        }
        return this.f31224g == musicPlaybackTrack.f31224g && this.f31225h == musicPlaybackTrack.f31225h && this.f31226i == musicPlaybackTrack.f31226i && this.f31227j == musicPlaybackTrack.f31227j;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f31224g);
        parcel.writeLong(this.f31225h);
        parcel.writeInt(this.f31226i.mId);
        parcel.writeInt(this.f31227j);
    }
}
