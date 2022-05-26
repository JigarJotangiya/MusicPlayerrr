package p342g.p343a.p344a.p349f;

import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.data.entity.C2342b;
import com.coocent.music.base.data.entity.Folder;
import com.coocent.music.base.data.entity.Music;
import coocent.music.player.activity.LibraryActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p349f.p351c.C8105g3;
import p342g.p343a.p344a.p349f.p351c.C8143m2;
import p342g.p343a.p344a.p349f.p351c.C8167p2;
import p342g.p343a.p344a.p349f.p351c.C8183r2;
import p342g.p343a.p344a.p349f.p351c.C8209v2;
import p342g.p343a.p344a.p355g.C8287e;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

/* renamed from: g.a.a.f.a */
/* compiled from: BaseFragment */
public abstract class C8010a extends Fragment {
    /* access modifiers changed from: protected */

    /* renamed from: d0 */
    public boolean f33734d0 = false;

    /* renamed from: e0 */
    private boolean f33735e0 = false;

    /* renamed from: f0 */
    public List<C2342b> f33736f0 = new ArrayList();

    /* renamed from: g0 */
    public int f33737g0 = 0;

    /* renamed from: h0 */
    protected List<Music> f33738h0;

    /* access modifiers changed from: protected */
    /* renamed from: Y2 */
    public static void m43743Y2(List<Music> list) {
        List<Music> O = C8287e.m45798O();
        if (O != null) {
            for (int i = 0; i < O.size(); i++) {
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (list.get(i2).mo9215k() == O.get(i).mo9215k()) {
                        list.get(i2).mo9232z(true);
                    }
                }
            }
        }
    }

    /* renamed from: C1 */
    public void mo3580C1() {
        super.mo3580C1();
        this.f33734d0 = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: X2 */
    public void mo29546X2(Object obj) {
        this.f33735e0 = true;
        try {
            int i = 0;
            if (mo29549b3().equals(C8105g3.class.getSimpleName())) {
                List list = (List) obj;
                if (list.size() < 11) {
                    Music music = new Music();
                    music.mo9262b(6);
                    this.f33736f0.add(music);
                    list.add(list.size(), music);
                    return;
                }
                int i2 = 0;
                while (i < 3) {
                    Music music2 = new Music();
                    music2.mo9262b(6);
                    this.f33736f0.add(music2);
                    i2 += 11;
                    if (i2 < list.size()) {
                        list.add(i2, music2);
                        i2++;
                    }
                    i++;
                }
            } else if (mo29549b3().equals(C8167p2.class.getSimpleName())) {
                List list2 = (List) obj;
                if (list2.size() < 11) {
                    Artist artist = new Artist();
                    artist.mo9262b(6);
                    this.f33736f0.add(artist);
                    list2.add(list2.size(), artist);
                    return;
                }
                int i3 = 0;
                while (i < 3) {
                    Artist artist2 = new Artist();
                    artist2.mo9262b(6);
                    this.f33736f0.add(artist2);
                    i3 += 11;
                    if (i3 < list2.size()) {
                        list2.add(i3, artist2);
                        i3++;
                    }
                    i++;
                }
            } else if (mo29549b3().equals(C8143m2.class.getSimpleName())) {
                List list3 = (List) obj;
                if (list3.size() < 11) {
                    Album album = new Album();
                    album.mo9262b(6);
                    this.f33736f0.add(album);
                    list3.add(list3.size(), album);
                    return;
                }
                int i4 = 0;
                while (i < 3) {
                    Album album2 = new Album();
                    album2.mo9262b(6);
                    this.f33736f0.add(album2);
                    i4 += 11;
                    if (i4 < list3.size()) {
                        list3.add(i4, album2);
                        i4++;
                    }
                    i++;
                }
            } else if (mo29549b3().equals(C8209v2.class.getSimpleName())) {
                List list4 = (List) obj;
                if (list4.size() < 11) {
                    Folder folder = new Folder();
                    folder.mo9262b(6);
                    this.f33736f0.add(folder);
                    list4.add(list4.size(), folder);
                    return;
                }
                int i5 = 0;
                while (i < 3) {
                    Folder folder2 = new Folder();
                    folder2.mo9262b(6);
                    this.f33736f0.add(folder2);
                    i5 += 11;
                    if (i5 < list4.size()) {
                        list4.add(i5, folder2);
                        i5++;
                    }
                    i++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: Z2 */
    public int mo29547Z2(int i) {
        if (this.f33735e0) {
            if (i <= 11) {
                this.f33737g0 = 1;
            } else {
                int i2 = i / 12;
                this.f33737g0 = i2;
                if (i2 >= 3) {
                    this.f33737g0 = 3;
                }
            }
        }
        return this.f33737g0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a3 */
    public int mo29548a3(Object obj, int i) {
        if (!this.f33735e0) {
            return i;
        }
        try {
            if (mo29549b3().equals(C8105g3.class.getSimpleName())) {
                ((List) obj).removeAll(this.f33736f0);
            } else if (mo29549b3().equals(C8167p2.class.getSimpleName())) {
                ((List) obj).removeAll(this.f33736f0);
            } else if (mo29549b3().equals(C8143m2.class.getSimpleName())) {
                ((List) obj).removeAll(this.f33736f0);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (i >= 36) {
            return i - 3;
        }
        int i2 = i / 12;
        return i2 <= 3 ? i - i2 : i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b3 */
    public abstract String mo29549b3();

    /* access modifiers changed from: protected */
    /* renamed from: c3 */
    public void mo29550c3() {
        FragmentActivity L = mo3606L();
        if (L instanceof LibraryActivity) {
            ((LibraryActivity) L).mo26658a4();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d3 */
    public List<Music> mo29551d3(int i, List<Music> list, List<Music> list2) {
        if (i == C8183r2.f34406b) {
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < list.size(); i2++) {
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    if (list.get(i2).mo9215k() == list2.get(i3).mo9215k()) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(Arrays.asList(new Object[list.size()]));
        Collections.copy(arrayList2, list);
        arrayList2.retainAll(list2);
        return arrayList2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e3 */
    public void mo29552e3(ImageView imageView) {
        if (!C8345u.m46336q()) {
            if (imageView != null) {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.back, R.color.default_text_color));
            }
        } else if (imageView != null) {
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.back_rtl, R.color.default_text_color));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f3 */
    public void mo29553f3(List<Music> list) {
        this.f33738h0 = list;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g3 */
    public void mo29554g3(ImageView imageView) {
        if (!C8345u.m46336q()) {
            if (imageView != null) {
                imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_next1, R.color.default_text_color));
            }
        } else if (imageView != null) {
            imageView.setImageDrawable(C8343s.m46304l(R.drawable.ic_next1_rtl, R.color.default_text_color));
        }
    }
}
