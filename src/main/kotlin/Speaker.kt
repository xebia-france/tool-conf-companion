data class Speaker(val id: String, var firstName: String? = null, var lastName: String? = null, var imageURL: String? = null, var bio: String? = null, var tweetHandle: String? = null, var talks: MutableList<Talk> = mutableListOf())