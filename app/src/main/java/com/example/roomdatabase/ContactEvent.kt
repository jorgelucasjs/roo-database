package com.example.roomdatabase

sealed interface ContactEvent {

    object SaveContact : ContactEvent

    data class SetFirstName(val firstName: String) : ContactEvent
    data class SetLastName(val lastName: String) : ContactEvent
    data class SetPhoneNumber(val phoneNumber: String) : ContactEvent

    object ShowDialog : ContactEvent
    object HiddenDialog : ContactEvent

    data class SortContacts(val sortType: SortType) : ContactEvent
    data class DeleteContacts(val contact: Contact) : ContactEvent

}