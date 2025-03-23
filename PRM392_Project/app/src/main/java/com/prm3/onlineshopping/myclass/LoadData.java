package com.prm3.onlineshopping.myclass;

import android.content.Context;

import com.prm3.onlineshopping.HomeDatabase;
import com.prm3.onlineshopping.ItemClass;
import com.prm3.onlineshopping.R;

import java.util.ArrayList;

public class LoadData {

    public LoadData(Context context){
        ArrayList<ItemClass> homeArrayList = new ArrayList<>();

        int itemCartColor = R.color.cart_image_red;
        homeArrayList.add(new ItemClass("Bánh mì hoa cúc","Bánh mềm, thơm bơ, có vị ngọt nhẹ và sợi bánh tơi xốp.  ",
                79900,R.drawable.hoacuc, itemCartColor,0));

        homeArrayList.add(new ItemClass("Bánh Tiramisu","Bánh mềm mịn, béo ngậy với hương vị đặc trưng của cà phê và kem mascarpone.",
                24990,R.drawable.tiramisu, itemCartColor,0));

        homeArrayList.add(new ItemClass("Bánh bông lan trứng muối", "Kết hợp giữa vị ngọt của bánh bông lan và vị mặn béo của trứng muối, chà bông. ", 203,
                R.drawable.trungmuoi, itemCartColor,0));

        homeArrayList.add(new ItemClass("Croissant (Bánh sừng bò)","Bánh có lớp vỏ giòn rụm, bên trong mềm xốp, thường ăn kèm với bơ hoặc mứt. ",884,R.drawable.croissant, itemCartColor,0));

        homeArrayList.add(new ItemClass("Cà phê đen đá","Cà phê pha phin truyền thống, đậm đà và mạnh mẽ. ",97990,R.drawable.denda, itemCartColor,0));

        homeArrayList.add(new ItemClass("Cà phê sữa đá","Kết hợp cà phê đậm đà với sữa đặc, tạo nên vị béo ngọt hấp dẫn.",179,R.drawable.suada, itemCartColor,0));

        homeArrayList.add(new ItemClass("Cà phê trứng","Đặc sản Hà Nội, cà phê kết hợp với lòng đỏ trứng đánh bông, tạo lớp kem mịn và béo ngậy.  ",425,R.drawable.cftrung, itemCartColor,0));

        homeArrayList.add(new ItemClass("Bạc xỉu","Cà phê sữa pha theo phong cách miền Nam, nhiều sữa hơn, vị ngọt và béo dịu nhẹ.",544,R.drawable.bacxiu, itemCartColor,0));

        homeArrayList.add(new ItemClass("Espresso","à phê Ý đậm đặc, thường uống với một lượng nhỏ.",2919,R.drawable.espresso, itemCartColor,0));

        homeArrayList.add(new ItemClass("Latte","Cà phê kết hợp với sữa tươi, tạo lớp bọt sữa mịn, phù hợp với người thích cà phê nhẹ.",332,R.drawable.late, itemCartColor,0));

        HomeDatabase homeDatabase = new HomeDatabase( context);
        for (int i = 0; i < homeArrayList.size(); i++) {
            ItemClass itemClass = homeArrayList.get(i);
            homeDatabase.addData(itemClass.itemName,itemClass.itemDisc, itemClass.prise,itemClass.image,itemClass.itemCartColor,itemClass.isCart);
        }
    }
}
