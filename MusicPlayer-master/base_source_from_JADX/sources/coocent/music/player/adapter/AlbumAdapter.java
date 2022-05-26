package coocent.music.player.adapter;

import android.graphics.drawable.Drawable;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Album;
import com.coocent.music.base.p056ui.view.SignKeyWordTextView;
import com.makeramen.roundedimageview.RoundedImageView;
import coocent.music.player.base.BaseApplication;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import p342g.p343a.p344a.p358i.C8314f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;

public class AlbumAdapter extends MultiItemAdapter<Album, BaseViewHolder> {

    /* renamed from: b */
    private final int f31087b;

    /* renamed from: c */
    private final int f31088c;

    public AlbumAdapter(int i, List<Album> list, int i2, int i3) {
        super(list);
        this.f31087b = i2;
        this.f31088c = i3;
        addItemType(0, i);
        addItemType(6, R.layout.item_native_ads_list);
    }

    /* renamed from: f */
    private String m39937f(Album album) {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(album.mo9140g());
        sb.append(" ");
        if (album.mo9140g() > 1) {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_songs);
        } else {
            str = C8345u.m46327h().getResources().getString(R.string.music_eq_song);
        }
        sb.append(str);
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void convert(BaseViewHolder baseViewHolder, Album album) {
        BaseViewHolder baseViewHolder2 = baseViewHolder;
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType == 0) {
            SignKeyWordTextView signKeyWordTextView = (SignKeyWordTextView) baseViewHolder2.getView(R.id.song_title);
            SignKeyWordTextView signKeyWordTextView2 = (SignKeyWordTextView) baseViewHolder2.getView(R.id.song_artist);
            int i = this.f31088c;
            if (i == 2 || i == 4) {
                signKeyWordTextView.setSignText(BaseApplication.f31146j);
                signKeyWordTextView2.setSignText(BaseApplication.f31146j);
                signKeyWordTextView.setSignTextColor(C8343s.m46300h());
                signKeyWordTextView2.setSignTextColor(C8343s.m46300h());
            }
            baseViewHolder2.setText((int) R.id.song_title, (CharSequence) album.mo9141h());
            baseViewHolder2.setText((int) R.id.song_artist, (CharSequence) m39937f(album) + " · " + album.mo9137e());
            baseViewHolder2.setTextColor(R.id.song_title, C9332d.m49405b(this.mContext, R.color.default_text_color));
            baseViewHolder2.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
            String b = C8314f.m45973b(this.mContext, 3, album.mo9139f(), album.mo9139f());
            RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder2.getView(R.id.albumArt);
            roundedImageView.setBackground(C8343s.m46298f(R.drawable.ic_library_icon05_tracks_song_smal_bg));
            roundedImageView.setOval(false);
            roundedImageView.setCornerRadius((float) C8345u.m46323d(5));
            Drawable l = C8343s.m46304l(R.drawable.ic_home_ic_albums, R.color.icon_tint_color);
            int i2 = 100;
            int d = C8345u.m46323d(this.f31087b == 0 ? 100 : 50);
            if (this.f31087b != 0) {
                i2 = 50;
            }
            C8321j.m46008n(b, l, roundedImageView, d, C8345u.m46323d(i2), false, false);
            baseViewHolder2.setImageDrawable(R.id.popup_menu, C8343s.m46304l(R.drawable.ic_home04_more, R.color.menu_tint_color));
            baseViewHolder2.addOnClickListener(R.id.popup_menu);
        } else if (itemViewType == 6) {
            mo26891d(baseViewHolder2, true);
        }
    }
}
