$(document).ready(function(){
    // the "href" attribute of the modal trigger must specify the modal ID that wants to be triggered
    $('.modal').modal();
    loadErrorModal();
    loadExpiredModal();
    loadSuccessModal();
});

function loadErrorModal() {
    $('#modalError').modal('open');
}

function loadExpiredModal() {
    $('#modalExpired').modal('open');
}

function loadSuccessModal() {
    $('#modalLogout').modal('open');
}
