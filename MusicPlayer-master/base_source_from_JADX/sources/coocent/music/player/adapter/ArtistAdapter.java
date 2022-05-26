package coocent.music.player.adapter;

import android.graphics.drawable.Drawable;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Artist;
import com.coocent.music.base.p056ui.view.SignKeyWordTextView;
import com.makeramen.roundedimageview.RoundedImageView;
import coocent.music.player.base.BaseApplication;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;

public class ArtistAdapter extends MultiItemAdapter<Artist, BaseViewHolder> {

    /* renamed from: b */
    private final int f31089b;

    /* renamed from: c */
    private final int f31090c;

    public ArtistAdapter(int i, List<Artist> list, int i2, int i3) {
        super(list);
        this.f31089b = i2;
        this.f31090c = i3;
        addItemType(0, i);
        addItemType(6, R.layout.item_native_ads_list);
    }

    /* renamed from: f */
    private String m39940f(Artist artist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(artist.mo9156d());
        sb.append(" ");
        if (artist.mo9156d() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.albums_counts);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.albums_count);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: g */
    private String m39941g(Artist artist) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(artist.mo9160f());
        sb.append(" ");
        if (artist.mo9160f() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_songs);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_song);
        }
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: h */
    private void m39942h(BaseViewHolder baseViewHolder, Artist artist) {
        SignKeyWordTextView signKeyWordTextView = (SignKeyWordTextView) baseViewHolder.getView(R.id.song_title);
        SignKeyWordTextView signKeyWordTextView2 = (SignKeyWordTextView) baseViewHolder.getView(R.id.song_artist);
        int i = this.f31090c;
        if (i == 2 || i == 4) {
            signKeyWordTextView.setSignText(BaseApplication.f31146j);
            signKeyWordTextView2.setSignText(BaseApplication.f31146j);
            signKeyWordTextView.setSignTextColor(C8343s.m46300h());
            signKeyWordTextView2.setSignTextColor(C8343s.m46300h());
        }
        BaseViewHolder text = baseViewHolder.setText((int) R.id.song_title, (CharSequence) artist.mo9161g());
        text.setText((int) R.id.song_artist, (CharSequence) m39941g(artist) + "·" + m39940f(artist));
        baseViewHolder.setTextColor(R.id.song_title, C8343s.m46295c(R.color.default_text_color));
        baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
        RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.albumArt);
        roundedImageView.setBackground(C8343s.m46298f(R.drawable.ic_home_ic_artists_bg));
        roundedImageView.setOval(true);
        String a = C8314f.m45972a(C8345u.m46327h(), 2, artist.mo9158e());
        if (!a.isEmpty()) {
            Drawable l = C8343s.m46304l(R.drawable.ic_home_ic_artists, R.color.icon_tint_color);
            int i2 = 150;
            int d = C8345u.m46323d(this.f31089b == 0 ? 150 : 50);
            if (this.f31089b != 0) {
                i2 = 50;
            }
            C8321j.m46008n(a, l, roundedImageView, d, C8345u.m46323d(i2), false, false);
        } else {
            baseViewHolder.setImageDrawable(R.id.albumArt, C8343s.m46304l(R.drawable.ic_home_ic_artists, R.color.icon_tint_color));
        }
        baseViewHolder.setImageDrawable(R.id.popup_menu, C8343s.m46304l(R.drawable.ic_home04_more, R.color.menu_tint_color));
        baseViewHolder.addOnClickListener(R.id.popup_menu);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void convert(BaseViewHolder baseViewHolder, Artist artist) {
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType == 0) {
            m39942h(baseViewHolder, artist);
        } else if (itemViewType == 6) {
            mo26891d(baseViewHolder, true);
        }
    }
}
