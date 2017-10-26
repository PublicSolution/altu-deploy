package org.psolution.altu.deployment.core.security

case class CertAuthenticationHandler(keyStorePass: String, storePass: String) extends AuthenticationHandler;
