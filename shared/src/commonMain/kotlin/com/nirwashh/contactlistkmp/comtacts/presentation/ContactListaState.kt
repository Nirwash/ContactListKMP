package com.nirwashh.contactlistkmp.comtacts.presentation

import com.nirwashh.contactlistkmp.comtacts.domain.model.Contact

data class ContactListState(
    val contacts: List<Contact> = emptyList(),
    val recentlyAddedContacts: List<Contact> = emptyList(),
    val selectedContact: Contact? = null,
    val isAddContactSheetOpen: Boolean = false,
    val isSelectedContactSheetOpen: Boolean = false,
    val firstNameError: String? = null,
    val secondNameError: String? = null,
    val emailError: String? = null,
    val phoneNumberError: String? = null
)
