package coocent.music.player.adapter;

import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.chad.library.adapter.base.BaseViewHolder;
import com.coocent.music.base.data.entity.Folder;
import com.makeramen.roundedimageview.RoundedImageView;
import java.util.List;
import media.musicplayer.audioplayer.videoplayer.R;
import net.coocent.android.xmlparser.p461z.C9566f;
import p342g.p343a.p344a.p358i.C8321j;
import p342g.p343a.p344a.p358i.C8343s;
import p342g.p343a.p344a.p358i.C8345u;
import p443m.p444a.p447e.p448a.C9332d;
import p453me.zhanghai.android.materialprogressbar.BuildConfig;

public class FolderAdapter extends MultiItemAdapter<Folder, BaseViewHolder> {

    /* renamed from: b */
    private int f31094b;

    public FolderAdapter(int i, List<Folder> list, int i2) {
        super(list);
        this.f31094b = i2;
        addItemType(0, i);
        addItemType(6, R.layout.item_native_ads_list);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void convert(BaseViewHolder baseViewHolder, Folder folder) {
        String str;
        int itemViewType = baseViewHolder.getItemViewType();
        if (itemViewType != 0) {
            if (itemViewType == 6) {
                mo26891d(baseViewHolder, true);
            }
        } else if (folder != null) {
            if (folder.mo9173d() > 1) {
                str = folder.mo9173d() + " " + this.mContext.getResources().getString(R.string.counttracks);
            } else {
                str = folder.mo9173d() + " " + this.mContext.getResources().getString(R.string.counttrack);
            }
            baseViewHolder.setText((int) R.id.song_title, (CharSequence) C8345u.m46334o(folder.mo9177f()));
            baseViewHolder.setText((int) R.id.song_artist, (CharSequence) str + "·" + folder.mo9177f());
            baseViewHolder.setTextColor(R.id.song_title, C9332d.m49405b(this.mContext, R.color.default_text_color));
            baseViewHolder.setTextColor(R.id.song_artist, C8343s.m46295c(R.color.app_sub_title_color));
            RoundedImageView roundedImageView = (RoundedImageView) baseViewHolder.getView(R.id.albumArt);
            roundedImageView.setOval(false);
            ViewGroup.LayoutParams layoutParams = roundedImageView.getLayoutParams();
            int a = C9566f.m50190a(C8345u.m46327h(), 35);
            layoutParams.height = a;
            layoutParams.width = a;
            Drawable f = C8343s.m46298f(R.drawable.ic_home_ic_list_folder);
            ImageView imageView = (ImageView) baseViewHolder.getView(R.id.albumArt);
            int i = 100;
            int d = C8345u.m46323d(this.f31094b == 0 ? 100 : 50);
            if (this.f31094b != 0) {
                i = 50;
            }
            C8321j.m46008n(BuildConfig.FLAVOR, f, imageView, d, C8345u.m46323d(i), false, false);
            baseViewHolder.setVisible(R.id.song_time, false);
            baseViewHolder.setImageDrawable(R.id.popup_menu, C8343s.m46304l(R.drawable.ic_home04_more, R.color.menu_tint_color));
            baseViewHolder.addOnClickListener(R.id.popup_menu);
        }
    }
}
