package android.support.p001v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaMetadata;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.media.session.MediaSessionCompat;
import android.util.Log;
import p082e.p098e.C3465a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.media.MediaMetadataCompat */
public final class MediaMetadataCompat implements Parcelable {
    public static final Parcelable.Creator<MediaMetadataCompat> CREATOR = new C0030a();

    /* renamed from: i */
    static final C3465a<String, Integer> f72i;

    /* renamed from: g */
    final Bundle f73g;

    /* renamed from: h */
    private MediaMetadata f74h;

    /* renamed from: android.support.v4.media.MediaMetadataCompat$a */
    class C0030a implements Parcelable.Creator<MediaMetadataCompat> {
        C0030a() {
        }

        /* renamed from: a */
        public MediaMetadataCompat createFromParcel(Parcel parcel) {
            return new MediaMetadataCompat(parcel);
        }

        /* renamed from: b */
        public MediaMetadataCompat[] newArray(int i) {
            return new MediaMetadataCompat[i];
        }
    }

    static {
        C3465a<String, Integer> aVar = new C3465a<>();
        f72i = aVar;
        aVar.put("android.media.metadata.TITLE", 1);
        aVar.put("android.media.metadata.ARTIST", 1);
        aVar.put("android.media.metadata.DURATION", 0);
        aVar.put("android.media.metadata.ALBUM", 1);
        aVar.put("android.media.metadata.AUTHOR", 1);
        aVar.put("android.media.metadata.WRITER", 1);
        aVar.put("android.media.metadata.COMPOSER", 1);
        aVar.put("android.media.metadata.COMPILATION", 1);
        aVar.put("android.media.metadata.DATE", 1);
        aVar.put("android.media.metadata.YEAR", 0);
        aVar.put("android.media.metadata.GENRE", 1);
        aVar.put("android.media.metadata.TRACK_NUMBER", 0);
        aVar.put("android.media.metadata.NUM_TRACKS", 0);
        aVar.put("android.media.metadata.DISC_NUMBER", 0);
        aVar.put("android.media.metadata.ALBUM_ARTIST", 1);
        aVar.put("android.media.metadata.ART", 2);
        aVar.put("android.media.metadata.ART_URI", 1);
        aVar.put("android.media.metadata.ALBUM_ART", 2);
        aVar.put("android.media.metadata.ALBUM_ART_URI", 1);
        aVar.put("android.media.metadata.USER_RATING", 3);
        aVar.put("android.media.metadata.RATING", 3);
        aVar.put("android.media.metadata.DISPLAY_TITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_SUBTITLE", 1);
        aVar.put("android.media.metadata.DISPLAY_DESCRIPTION", 1);
        aVar.put("android.media.metadata.DISPLAY_ICON", 2);
        aVar.put("android.media.metadata.DISPLAY_ICON_URI", 1);
        aVar.put("android.media.metadata.MEDIA_ID", 1);
        aVar.put("android.media.metadata.BT_FOLDER_TYPE", 0);
        aVar.put("android.media.metadata.MEDIA_URI", 1);
        aVar.put("android.media.metadata.ADVERTISEMENT", 0);
        aVar.put("android.media.metadata.DOWNLOAD_STATUS", 0);
    }

    MediaMetadataCompat(Bundle bundle) {
        Bundle bundle2 = new Bundle(bundle);
        this.f73g = bundle2;
        MediaSessionCompat.m149b(bundle2);
    }

    /* renamed from: b */
    public static MediaMetadataCompat m91b(Object obj) {
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        MediaMetadata mediaMetadata = (MediaMetadata) obj;
        mediaMetadata.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        MediaMetadataCompat createFromParcel = CREATOR.createFromParcel(obtain);
        obtain.recycle();
        createFromParcel.f74h = mediaMetadata;
        return createFromParcel;
    }

    /* renamed from: a */
    public boolean mo88a(String str) {
        return this.f73g.containsKey(str);
    }

    /* renamed from: d */
    public Bitmap mo89d(String str) {
        try {
            return (Bitmap) this.f73g.getParcelable(str);
        } catch (Exception e) {
            Log.w("MediaMetadata", "Failed to retrieve a key as Bitmap.", e);
            return null;
        }
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public Bundle mo91e() {
        return new Bundle(this.f73g);
    }

    /* renamed from: f */
    public long mo92f(String str) {
        return this.f73g.getLong(str, 0);
    }

    /* renamed from: g */
    public Object mo93g() {
        if (this.f74h == null && Build.VERSION.SDK_INT >= 21) {
            Parcel obtain = Parcel.obtain();
            writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            this.f74h = (MediaMetadata) MediaMetadata.CREATOR.createFromParcel(obtain);
            obtain.recycle();
        }
        return this.f74h;
    }

    /* renamed from: h */
    public String mo94h(String str) {
        CharSequence charSequence = this.f73g.getCharSequence(str);
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.f73g);
    }

    /* renamed from: android.support.v4.media.MediaMetadataCompat$b */
    public static final class C0031b {

        /* renamed from: a */
        private final Bundle f75a;

        public C0031b() {
            this.f75a = new Bundle();
        }

        /* renamed from: e */
        private Bitmap m100e(Bitmap bitmap, int i) {
            float f = (float) i;
            float min = Math.min(f / ((float) bitmap.getWidth()), f / ((float) bitmap.getHeight()));
            return Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * min), (int) (((float) bitmap.getHeight()) * min), true);
        }

        /* renamed from: a */
        public MediaMetadataCompat mo100a() {
            return new MediaMetadataCompat(this.f75a);
        }

        /* renamed from: b */
        public C0031b mo101b(String str, Bitmap bitmap) {
            C3465a<String, Integer> aVar = MediaMetadataCompat.f72i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 2) {
                this.f75a.putParcelable(str, bitmap);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a Bitmap");
        }

        /* renamed from: c */
        public C0031b mo102c(String str, long j) {
            C3465a<String, Integer> aVar = MediaMetadataCompat.f72i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 0) {
                this.f75a.putLong(str, j);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a long");
        }

        /* renamed from: d */
        public C0031b mo103d(String str, String str2) {
            C3465a<String, Integer> aVar = MediaMetadataCompat.f72i;
            if (!aVar.containsKey(str) || aVar.get(str).intValue() == 1) {
                this.f75a.putCharSequence(str, str2);
                return this;
            }
            throw new IllegalArgumentException("The " + str + " key cannot be used to put a String");
        }

        public C0031b(MediaMetadataCompat mediaMetadataCompat) {
            Bundle bundle = new Bundle(mediaMetadataCompat.f73g);
            this.f75a = bundle;
            MediaSessionCompat.m149b(bundle);
        }

        public C0031b(MediaMetadataCompat mediaMetadataCompat, int i) {
            this(mediaMetadataCompat);
            for (String str : this.f75a.keySet()) {
                Object obj = this.f75a.get(str);
                if (obj instanceof Bitmap) {
                    Bitmap bitmap = (Bitmap) obj;
                    if (bitmap.getHeight() > i || bitmap.getWidth() > i) {
                        mo101b(str, m100e(bitmap, i));
                    }
                }
            }
        }
    }

    MediaMetadataCompat(Parcel parcel) {
        this.f73g = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
    }
}
