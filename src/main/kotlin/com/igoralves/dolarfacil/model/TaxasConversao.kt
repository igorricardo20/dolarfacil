package com.igoralves.dolarfacil.model

import com.google.gson.annotations.SerializedName

data class TaxasConversao (
  @SerializedName("itens" ) var itens : ArrayList<Itens> = arrayListOf()

)