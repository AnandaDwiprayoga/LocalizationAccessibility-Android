package com.dicoding.picodiploma.productdetail

import android.content.Context

class RemoteDataSource(private val context: Context) {
    fun getDetailProduct(): ProductModel =
        ProductModel(
            name = context.getString(R.string.sepatu_lari),
            store = context.getString(R.string.toko_dicoding),
            size = context.getString(R.string.dummy_size_shoes),
            color = context.getString(R.string.coklat),
            desc = context.getString(R.string.dumy_description),
            image = R.drawable.shoes,
            date = context.getString(R.string.diunggah_5_agu_2021),
            rating = context.getString(R.string.rating_sample),
            price = context.getString(R.string.price),
            countRating = context.getString(R.string.count_rating)
        )
}