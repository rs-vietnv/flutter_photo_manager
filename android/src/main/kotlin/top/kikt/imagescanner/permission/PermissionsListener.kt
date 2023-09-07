package top.kikt.imagescanner.permission

interface PermissionsListener {
    fun onGranted()
    fun onDenied(deniedPermissions: MutableList<String>, grantedPermissions: MutableList<String>)
}