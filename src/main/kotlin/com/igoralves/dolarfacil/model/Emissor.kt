package com.igoralves.dolarfacil.model

import com.google.gson.annotations.SerializedName


data class Emissor (

  @SerializedName("emissorCnpj") var emissorCnpj : String? = null,
  @SerializedName("emissorNome") var emissorNome : String? = null

)