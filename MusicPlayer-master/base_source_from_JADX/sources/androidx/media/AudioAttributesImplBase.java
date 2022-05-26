package androidx.media;

import android.util.Log;
import androidx.media.AudioAttributesImpl;
import com.chad.library.adapter.base.BaseQuickAdapter;
import java.util.Arrays;

public class AudioAttributesImplBase implements AudioAttributesImpl {

    /* renamed from: a */
    public int f3355a = 0;

    /* renamed from: b */
    public int f3356b = 0;

    /* renamed from: c */
    public int f3357c = 0;

    /* renamed from: d */
    public int f3358d = -1;

    /* renamed from: androidx.media.AudioAttributesImplBase$a */
    static class C0728a implements AudioAttributesImpl.C0725a {

        /* renamed from: a */
        private int f3359a = 0;

        /* renamed from: b */
        private int f3360b = 0;

        /* renamed from: c */
        private int f3361c = 0;

        /* renamed from: d */
        private int f3362d = -1;

        C0728a() {
        }

        /* renamed from: f */
        private C0728a m4344f(int i) {
            switch (i) {
                case 0:
                    this.f3360b = 1;
                    break;
                case 1:
                    break;
                case 2:
                    this.f3360b = 4;
                    break;
                case 3:
                    this.f3360b = 2;
                    break;
                case 4:
                    this.f3360b = 4;
                    break;
                case 5:
                    this.f3360b = 4;
                    break;
                case 6:
                    this.f3360b = 1;
                    this.f3361c |= 4;
                    break;
                case 7:
                    this.f3361c = 1 | this.f3361c;
                    break;
                case 8:
                    this.f3360b = 4;
                    break;
                case 9:
                    this.f3360b = 4;
                    break;
                case 10:
                    this.f3360b = 1;
                    break;
                default:
                    Log.e("AudioAttributesCompat", "Invalid stream type " + i + " for AudioAttributesCompat");
                    break;
            }
            this.f3360b = 4;
            this.f3359a = AudioAttributesImplBase.m4338f(i);
            return this;
        }

        /* renamed from: a */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4283a(int i) {
            mo4303g(i);
            return this;
        }

        /* renamed from: b */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4284b(int i) {
            mo4302e(i);
            return this;
        }

        /* renamed from: c */
        public /* bridge */ /* synthetic */ AudioAttributesImpl.C0725a mo4285c(int i) {
            mo4304h(i);
            return this;
        }

        /* renamed from: d */
        public AudioAttributesImpl mo4286d() {
            return new AudioAttributesImplBase(this.f3360b, this.f3361c, this.f3359a, this.f3362d);
        }

        /* renamed from: e */
        public C0728a mo4302e(int i) {
            if (i == 0 || i == 1 || i == 2 || i == 3 || i == 4) {
                this.f3360b = i;
            } else {
                this.f3360b = 0;
            }
            return this;
        }

        /* renamed from: g */
        public C0728a mo4303g(int i) {
            if (i != 10) {
                this.f3362d = i;
                m4344f(i);
                return this;
            }
            throw new IllegalArgumentException("STREAM_ACCESSIBILITY is not a legacy stream type that was used for audio playback");
        }

        /* renamed from: h */
        public C0728a mo4304h(int i) {
            switch (i) {
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    this.f3359a = i;
                    break;
                case 16:
                    this.f3359a = 12;
                    break;
                default:
                    this.f3359a = 0;
                    break;
            }
            return this;
        }
    }

    public AudioAttributesImplBase() {
    }

    /* renamed from: f */
    static int m4338f(int i) {
        switch (i) {
            case 0:
                return 2;
            case 1:
            case 7:
                return 13;
            case 2:
                return 6;
            case 3:
                return 1;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 2;
            case 8:
                return 3;
            case 10:
                return 11;
            default:
                return 0;
        }
    }

    /* renamed from: a */
    public int mo4281a() {
        int i = this.f3358d;
        if (i != -1) {
            return i;
        }
        return AudioAttributesCompat.m4308c(false, this.f3357c, this.f3355a);
    }

    /* renamed from: b */
    public Object mo4282b() {
        return null;
    }

    /* renamed from: c */
    public int mo4296c() {
        return this.f3356b;
    }

    /* renamed from: d */
    public int mo4297d() {
        int i = this.f3357c;
        int a = mo4281a();
        if (a == 6) {
            i |= 4;
        } else if (a == 7) {
            i |= 1;
        }
        return i & BaseQuickAdapter.HEADER_VIEW;
    }

    /* renamed from: e */
    public int mo4298e() {
        return this.f3355a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.f3356b == audioAttributesImplBase.mo4296c() && this.f3357c == audioAttributesImplBase.mo4297d() && this.f3355a == audioAttributesImplBase.mo4298e() && this.f3358d == audioAttributesImplBase.f3358d) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f3356b), Integer.valueOf(this.f3357c), Integer.valueOf(this.f3355a), Integer.valueOf(this.f3358d)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AudioAttributesCompat:");
        if (this.f3358d != -1) {
            sb.append(" stream=");
            sb.append(this.f3358d);
            sb.append(" derived");
        }
        sb.append(" usage=");
        sb.append(AudioAttributesCompat.m4309e(this.f3355a));
        sb.append(" content=");
        sb.append(this.f3356b);
        sb.append(" flags=0x");
        sb.append(Integer.toHexString(this.f3357c).toUpperCase());
        return sb.toString();
    }

    AudioAttributesImplBase(int i, int i2, int i3, int i4) {
        this.f3356b = i;
        this.f3357c = i2;
        this.f3355a = i3;
        this.f3358d = i4;
    }
}
