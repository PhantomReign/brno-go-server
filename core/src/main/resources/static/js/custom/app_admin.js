$(document).ready(function(){
    // the "href" attribute of the modal trigger must specify the modal ID that wants to be triggered
    $('.modal').modal();
    loadFailedModal();
    loadSuccessModal();

    $('.dropdown-button').dropdown({
            inDuration: 300,
            outDuration: 225,
            gutter: 15,
            belowOrigin: true
        }
    );
});

function loadFailedModal() {
    $('#modalFailed').modal('open');
}

function loadSuccessModal() {
    $('#modalSuccess').modal('open');
}

function logout() {
    document.getElementById('form-logout').submit();
}